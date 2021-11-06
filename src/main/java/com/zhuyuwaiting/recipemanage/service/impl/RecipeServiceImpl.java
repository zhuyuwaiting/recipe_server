package com.zhuyuwaiting.recipemanage.service.impl;

import com.alibaba.druid.support.spring.stat.annotation.Stat;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeListRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeUpdateRequest;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeListResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeUpdateResponse;
import com.zhuyuwaiting.recipemanage.enums.AgeTypeEnum;
import com.zhuyuwaiting.recipemanage.enums.SceneNoEnum;
import com.zhuyuwaiting.recipemanage.enums.StatusEnum;
import com.zhuyuwaiting.recipemanage.mapper.RecipeDetailMapper;
import com.zhuyuwaiting.recipemanage.mapper.RecipeInfoMapper;
import com.zhuyuwaiting.recipemanage.model.RecipeDetail;
import com.zhuyuwaiting.recipemanage.model.RecipeInfo;
import com.zhuyuwaiting.recipemanage.service.MedicineService;
import com.zhuyuwaiting.recipemanage.service.RecipeService;
import com.zhuyuwaiting.recipemanage.util.NoUtils;
import com.zhuyuwaiting.recipemanage.vo.MedicineVO;
import com.zhuyuwaiting.recipemanage.vo.Pagination;
import com.zhuyuwaiting.recipemanage.vo.RecipeDetailVO;
import com.zhuyuwaiting.recipemanage.vo.RecipeInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeInfoMapper recipeInfoMapper;

    @Autowired
    private RecipeDetailMapper recipeDetailMapper;


    @Autowired
    private MedicineService medicineService;

    @Override
    public RecipeListResponse list(RecipeListRequest request) {
        RecipeListResponse response = new RecipeListResponse();
        Map<String,Object> params = new HashMap<>();
        params.put("recipeNo", request.getRecipeNo());
        params.put("recipeType", request.getRecipeType());
        params.put("patientName", request.getPatientName());
        params.put("status", StatusEnum.VALID.getCode());
        params.put("current", (request.getCurrent() - 1) * request.getPageSize());
        params.put("pageSize", request.getPageSize());
        params.put("orderBy", "create_time desc");
        params.put("userId",request.getUserId());
        List<RecipeInfo> recipeInfos = recipeInfoMapper.selectByParams(params);
        int count = recipeInfoMapper.countByParams(params);
        Pagination pagination = new Pagination();
        pagination.setTotal(count);
        pagination.setCurrent(request.getCurrent());
        pagination.setPageSize(request.getPageSize());
        response.setPagination(pagination);
        if (CollectionUtils.isEmpty(recipeInfos)) {
            return response;
        }
        List<RecipeInfoVO> recipeInfoVOS = recipeInfos.stream().map(recipeInfo -> {
           RecipeInfoVO recipeInfoVO = new RecipeInfoVO();
            BeanUtils.copyProperties(recipeInfo,recipeInfoVO);
            AgeTypeEnum ageType = AgeTypeEnum.getByCode(recipeInfo.getAgeType());
            if (ageType != null) {
                recipeInfoVO.setAgeTypeName(ageType.getDesc());
            }
           return recipeInfoVO;
        }).collect(Collectors.toList());
        response.setRecipeInfoVOS(recipeInfoVOS);
        return response;
    }

    @Override
    @Transactional
    public RecipeAddResponse add(RecipeAddRequest request) {
        RecipeAddResponse response = new RecipeAddResponse();
        String recipeInfoNo = NoUtils.genNO(SceneNoEnum.RECIPE_NO);
        RecipeInfo recipeInfo = new RecipeInfo();
        BeanUtils.copyProperties(request,recipeInfo);
        recipeInfo.setCreateTime(new Date());
        recipeInfo.setUpdateTime(new Date());
        recipeInfo.setRecipeNo(recipeInfoNo);
        recipeInfo.setUserId(request.getUserId());
        recipeInfo.setStatus(StatusEnum.VALID.getCode());
        recipeInfoMapper.insertSelective(recipeInfo);
        if(CollectionUtils.isEmpty(request.getRecipeDetailVOS())){
            return response;
        }
        List<RecipeDetail> recipeDetails = request.getRecipeDetailVOS().stream()
                .map(recipeDetailVO -> {
                    RecipeDetail recipeDetail = new RecipeDetail();
                    recipeDetail.setMedicineNo(recipeDetailVO.getMedicineNo());
                    recipeDetail.setMedicineNum(recipeDetailVO.getMedicineNum());
                    recipeDetail.setMedicineAdvice(recipeDetailVO.getMedicineAdvice());
                    recipeDetail.setRecipeNo(recipeInfoNo);
                    return recipeDetail;
                }).collect(Collectors.toList());
        recipeDetailMapper.batchInsert(recipeDetails);
        response.setRecipeInfoVO(query(recipeInfoNo));
        return response;
    }

    @Override
    @Transactional
    public RecipeDelResponse del(RecipeDelRequest request) {
        RecipeDelResponse response = new RecipeDelResponse();
        recipeInfoMapper.deleteByNos(request.getRecipeNos(), request.getUserId());
        return response;
    }

    @Override
    public RecipeInfoVO query(String recipeTemplateNo) {
        RecipeInfo recipeInfo = recipeInfoMapper.selelctByNo(recipeTemplateNo);
        //查询细节
        Map<String, Object> tempParams = new HashMap<>();
        tempParams.put("recipeNo", recipeTemplateNo);
        List<RecipeDetail> recipeDetails =
                recipeDetailMapper.selectByParams(tempParams);

        Map<String, List<RecipeDetail>> recipeDetailMap =
                new HashMap<>();
        Map<String, MedicineVO> medicineVOMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(recipeDetails)) {
            recipeDetails.stream().forEach(recipeDetail -> {
                if (recipeDetailMap.get(recipeDetail.getRecipeNo()) == null) {
                    recipeDetailMap.put(recipeDetail.getRecipeNo(), new ArrayList<>());
                }
                recipeDetailMap.get(recipeDetail.getRecipeNo()).add(recipeDetail);
            });
            List<String> medicineNos = recipeDetails.stream().map(recipeDetail -> recipeDetail.getMedicineNo()).collect(Collectors.toList());
            List<MedicineVO> medicineVOS = medicineService.selectByMedicineNos(medicineNos);
            if(!CollectionUtils.isEmpty(medicineVOS)){
                medicineVOS.stream().forEach(medicineVO -> {
                    medicineVOMap.put(medicineVO.getMedicineNo(),medicineVO);
                });
            }
        }
        RecipeInfoVO recipeInfoVO = new RecipeInfoVO();
        AgeTypeEnum ageType = AgeTypeEnum.getByCode(recipeInfo.getAgeType());
        if (ageType != null) {
            recipeInfoVO.setAgeTypeName(ageType.getDesc());
        }
        BeanUtils.copyProperties(recipeInfo, recipeInfoVO);
        if (!CollectionUtils.isEmpty(recipeDetailMap.get(recipeInfo.getRecipeNo()))) {
            List<RecipeDetailVO> recipeDetailVOS = recipeDetailMap.get(recipeInfo.getRecipeNo())
                    .stream().map(recipeDetail -> {
                        RecipeDetailVO recipeDetailVO = new RecipeDetailVO();
                        BeanUtils.copyProperties(recipeDetail,recipeDetailVO);
                        recipeDetailVO.setMedicineVO(medicineVOMap.get(recipeDetail.getMedicineNo()));
                        return recipeDetailVO;
                    }).collect(Collectors.toList());
            recipeInfoVO.setRecipeDetailVOS(recipeDetailVOS);
        }
        return recipeInfoVO;
    }

    @Override
    public RecipeUpdateResponse update(RecipeUpdateRequest request) {
        RecipeUpdateResponse response = new RecipeUpdateResponse();
        List<RecipeDetail> recipeTemplateDetails = request.getRecipeDetailVOS()
                .stream().map(recipeDetailVO -> {
                    RecipeDetail recipeDetail = new RecipeDetail();
                    BeanUtils.copyProperties(recipeDetailVO, recipeDetail);
                    recipeDetail.setRecipeNo(request.getRecipeNo());
                    return recipeDetail;
                }).collect(Collectors.toList());
        //不考虑其他 简化版 先删除原始的 在插入新的
        recipeDetailMapper.deleteByRecipeNos(Arrays.asList(request.getRecipeNo()));

        if (!StringUtils.isEmpty(request.getDisease()) ||
                !StringUtils.isEmpty(request.getClassfication())||
                !StringUtils.isEmpty(request.getNum())||
                !StringUtils.isEmpty(request.getPatientAge())
                ||
                !StringUtils.isEmpty(request.getPatientSex())||
                !StringUtils.isEmpty(request.getPatientName())) {
            // 修改
            RecipeInfo recipeInfo = new RecipeInfo();
            BeanUtils.copyProperties(request,recipeInfo);
            recipeInfoMapper.updateBySelective(recipeInfo);
        }
        //插入新的 recipeTemplateDetails
        recipeDetailMapper.batchInsert(recipeTemplateDetails);
        return response;
    }
}

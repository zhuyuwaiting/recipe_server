package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateListRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateUpdateRequest;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateListResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateUpdateResponse;
import com.zhuyuwaiting.recipemanage.enums.SceneNoEnum;
import com.zhuyuwaiting.recipemanage.enums.StatusEnum;
import com.zhuyuwaiting.recipemanage.mapper.RecipeTemplateDetailMapper;
import com.zhuyuwaiting.recipemanage.mapper.RecipeTemplateMapper;
import com.zhuyuwaiting.recipemanage.model.RecipeTemplate;
import com.zhuyuwaiting.recipemanage.model.RecipeTemplateDetail;
import com.zhuyuwaiting.recipemanage.service.MedicineService;
import com.zhuyuwaiting.recipemanage.service.RecipeTemplateService;
import com.zhuyuwaiting.recipemanage.util.NoUtils;
import com.zhuyuwaiting.recipemanage.vo.MedicineVO;
import com.zhuyuwaiting.recipemanage.vo.Pagination;
import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateDetailVO;
import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateVO;
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
public class RecipeTemplateServiceImpl implements RecipeTemplateService {

    @Autowired
    private RecipeTemplateMapper recipeTemplateMapper;

    @Autowired
    private MedicineService medicineService;

    @Autowired
    private RecipeTemplateDetailMapper recipeTemplateDetailMapper;

    @Override
    public RecipeTemplateListResponse list(RecipeTemplateListRequest request) {
        RecipeTemplateListResponse response = new RecipeTemplateListResponse();
        Map<String, Object> params = new HashMap<>();
        params.put("recipeTemplateNo", request.getRecipeTemplateNo());
        params.put("recipeType", request.getRecipeType());
        params.put("disease", request.getDisease());
        params.put("classfication", request.getClassfication());
        params.put("status", request.getStatus());
        params.put("current", (request.getCurrent() - 1) * request.getPageSize());
        params.put("pageSize", request.getPageSize());
        params.put("orderBy", "create_time desc");
        List<RecipeTemplate> recipeTemplates = recipeTemplateMapper.selectByParams(params);
        int count = recipeTemplateMapper.countByParams(params);
        Pagination pagination = new Pagination();
        pagination.setTotal(count);
        pagination.setCurrent(request.getCurrent());
        pagination.setPageSize(request.getPageSize());
        response.setPagination(pagination);
        if (CollectionUtils.isEmpty(recipeTemplates)) {
            return response;
        }

        Map<String, List<RecipeTemplateDetailVO>> recipeTemplateDetailMap =
                new HashMap<>();
        Map<String,MedicineVO> medicineVOMap = new HashMap<>();
       if(request.isNeedDetails()) {
           //获取所有的recipeDetails;
           List<String> recipeTemplateNos = recipeTemplates.stream()
                   .map(recipeTemplate -> recipeTemplate.getRecipeTemplateNo())
                   .collect(Collectors.toList());
           Map<String, Object> templateParams = new HashMap<>();
           templateParams.put("recipeTemplateNos", recipeTemplateNos);
           List<RecipeTemplateDetail> recipeTemplateDetails = recipeTemplateDetailMapper.selectByParams(templateParams);
           if (!CollectionUtils.isEmpty(recipeTemplateDetails)) {
               List<String> medicineNos = recipeTemplateDetails.stream()
                       .map(recipeTemplateDetail -> recipeTemplateDetail.getMedicineNo())
                       .collect(Collectors.toList());
               List<MedicineVO> medicineVOS = medicineService.selectByMedicineNos(medicineNos);
               if (!CollectionUtils.isEmpty(medicineVOS)) {
                   medicineVOS.stream().forEach(medicineVO -> {
                       medicineVOMap.put(medicineVO.getMedicineNo(), medicineVO);
                   });
               }
               recipeTemplateDetails.stream().forEach(recipeTemplateDetail -> {
                   RecipeTemplateDetailVO recipeTemplateDetailVO = new RecipeTemplateDetailVO();
                   BeanUtils.copyProperties(recipeTemplateDetail, recipeTemplateDetailVO);
                   recipeTemplateDetailVO.setMedicineVO(medicineVOMap.get(recipeTemplateDetail.getMedicineNo()));
                   if (recipeTemplateDetailMap.get(recipeTemplateDetail.getRecipeTemplateNo()) == null) {
                       recipeTemplateDetailMap.put(recipeTemplateDetail.getRecipeTemplateNo(), new ArrayList<>());
                   }

                   recipeTemplateDetailMap.get(recipeTemplateDetail.getRecipeTemplateNo()).add(recipeTemplateDetailVO);
               });

           }
       }

        List<RecipeTemplateVO> recipeTemplateVOS = recipeTemplates.stream().map(recipeTemplate -> {
            RecipeTemplateVO recipeTemplateVO = new RecipeTemplateVO();
            BeanUtils.copyProperties(recipeTemplate, recipeTemplateVO);
            recipeTemplateVO.setRecipeTemplateDetailVOS(recipeTemplateDetailMap.get(recipeTemplate.getRecipeTemplateNo()));
            return recipeTemplateVO;
        }).collect(Collectors.toList());
        response.setRecipeTemplateVOS(recipeTemplateVOS);

        return response;
    }

    @Override
    @Transactional
    public RecipeTemplateAddResponse add(RecipeTemplateAddRequest request) {
        RecipeTemplateAddResponse response = new RecipeTemplateAddResponse();
        String recipeTemplateNo = NoUtils.genNO(SceneNoEnum.RECIPE_TEMPLATE_NO);
        RecipeTemplate recipeTemplate = new RecipeTemplate();
        recipeTemplate.setRecipeTemplateNo(recipeTemplateNo);
        recipeTemplate.setRecipeType(request.getRecipeType());
        recipeTemplate.setDisease(request.getDisease());
        recipeTemplate.setClassfication(request.getClassfication());
        recipeTemplate.setCreateTime(new Date());
        recipeTemplate.setUpdateTime(new Date());
        recipeTemplate.setStatus(StatusEnum.VALID.getCode());
        recipeTemplateMapper.insertSelective(recipeTemplate);
        //插入药品信息
        if (CollectionUtils.isEmpty(request.getRecipeTemplateDetailVOS())) {
            return response;
        }
        List<RecipeTemplateDetail> recipeTemplates = request.getRecipeTemplateDetailVOS()
                .stream().map(recipeTemplateDetailVO -> {
                    RecipeTemplateDetail recipeTemplateDetail = new RecipeTemplateDetail();
                    recipeTemplateDetail.setMedicineNum(recipeTemplateDetailVO.getMedicineNum());
                    recipeTemplateDetail.setMedicineNo(recipeTemplateDetailVO.getMedicineNo());
                    recipeTemplateDetail.setRecipeTemplateNo(recipeTemplate.getRecipeTemplateNo());
                    return recipeTemplateDetail;
                }).collect(Collectors.toList());
        recipeTemplateDetailMapper.batchInsert(recipeTemplates);
        RecipeTemplate result = recipeTemplateMapper.selelctByNo(recipeTemplateNo);
        RecipeTemplateVO resultVo = new RecipeTemplateVO();
        BeanUtils.copyProperties(result, resultVo);
        response.setRecipeTemplateVO(resultVo);
        return response;
    }

    @Override
    @Transactional
    public RecipeTemplateDelResponse del(RecipeTemplateDelRequest request) {
        RecipeTemplateDelResponse response = new RecipeTemplateDelResponse();
        recipeTemplateMapper.deleteByNos(request.getRecipeTemplateNos());
        return response;
    }


    @Override
    @Transactional
    public RecipeTemplateUpdateResponse update(RecipeTemplateUpdateRequest request) {
        RecipeTemplateUpdateResponse response = new RecipeTemplateUpdateResponse();
        List<RecipeTemplateDetail> recipeTemplateDetails = request.getRecipeTemplateDetailVOS()
                .stream().map(recipeTemplateDetailVO -> {
                    RecipeTemplateDetail recipeTemplateDetail = new RecipeTemplateDetail();
                    BeanUtils.copyProperties(recipeTemplateDetailVO, recipeTemplateDetail);
                    recipeTemplateDetail.setRecipeTemplateNo(request.getRecipeTemplateNo());
                    return recipeTemplateDetail;
                }).collect(Collectors.toList());
        //不考虑其他 简化版 先删除原始的 在插入新的
        recipeTemplateDetailMapper.deleteByRecipeTemplateNos(Arrays.asList(request.getRecipeTemplateNo()));

        if (!StringUtils.isEmpty(request.getDisease()) || !StringUtils.isEmpty(request.getClassfication())) {
            // 修改
            RecipeTemplate recipeTemplate = new RecipeTemplate();
            recipeTemplate.setDisease(request.getDisease());
            recipeTemplate.setClassfication(request.getClassfication());
            recipeTemplate.setRecipeTemplateNo(request.getRecipeTemplateNo());
            recipeTemplateMapper.updateBySelective(recipeTemplate);
        }
        //插入新的 recipeTemplateDetails
        recipeTemplateDetailMapper.batchInsert(recipeTemplateDetails);
        return response;
    }

    @Override
    public RecipeTemplateVO query(String recipeTemplateNo) {
        RecipeTemplate recipeTemplate = recipeTemplateMapper.selelctByNo(recipeTemplateNo);
        //查询细节
        Map<String, Object> tempParams = new HashMap<>();
        tempParams.put("recipeTemplateNo", recipeTemplateNo);
        List<RecipeTemplateDetail> recipeTemplateDetails =
                recipeTemplateDetailMapper.selectByParams(tempParams);

        Map<String, List<RecipeTemplateDetail>> recipeTemplateDetailMap =
                new HashMap<>();
        Map<String,MedicineVO> medicineVOMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(recipeTemplateDetails)) {
            recipeTemplateDetails.stream().forEach(recipeTemplateDetail -> {
                if (recipeTemplateDetailMap.get(recipeTemplateDetail.getRecipeTemplateNo()) == null) {
                    recipeTemplateDetailMap.put(recipeTemplateDetail.getRecipeTemplateNo(), new ArrayList<>());
                }
                recipeTemplateDetailMap.get(recipeTemplateDetail.getRecipeTemplateNo()).add(recipeTemplateDetail);
            });
            List<String> medicineNos = recipeTemplateDetails.stream().map(recipeTemplateDetail -> recipeTemplateDetail.getMedicineNo()).collect(Collectors.toList());
            List<MedicineVO> medicineVOS = medicineService.selectByMedicineNos(medicineNos);
            if(!CollectionUtils.isEmpty(medicineVOS)){
                medicineVOS.stream().forEach(medicineVO -> {
                    medicineVOMap.put(medicineVO.getMedicineNo(),medicineVO);
                });
            }
        }
        RecipeTemplateVO recipeTemplateVO = new RecipeTemplateVO();
        BeanUtils.copyProperties(recipeTemplate, recipeTemplateVO);
        if (!CollectionUtils.isEmpty(recipeTemplateDetailMap.get(recipeTemplate.getRecipeTemplateNo()))) {
            List<RecipeTemplateDetailVO> recipeTemplateDetailVOs = recipeTemplateDetailMap.get(recipeTemplate.getRecipeTemplateNo())
                    .stream().map(recipeTemplateDetail -> {
                        RecipeTemplateDetailVO recipeTemplateDetailVO = new RecipeTemplateDetailVO();
                        BeanUtils.copyProperties(recipeTemplateDetail,recipeTemplateDetailVO);
                        recipeTemplateDetailVO.setMedicineVO(medicineVOMap.get(recipeTemplateDetail.getMedicineNo()));
                        return recipeTemplateDetailVO;
                    }).collect(Collectors.toList());
            recipeTemplateVO.setRecipeTemplateDetailVOS(recipeTemplateDetailVOs);
        }
        return recipeTemplateVO;
    }

}

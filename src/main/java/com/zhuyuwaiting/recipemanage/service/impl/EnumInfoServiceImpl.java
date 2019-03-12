package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.controller.req.EnumInfoAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.EnumInfoListRequest;
import com.zhuyuwaiting.recipemanage.controller.res.EnumInfoAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.EnumInfoListResponse;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.enums.StatusEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.mapper.EnumInfoMapper;
import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import com.zhuyuwaiting.recipemanage.service.EnumInfoService;
import com.zhuyuwaiting.recipemanage.vo.EnumInfoVO;
import com.zhuyuwaiting.recipemanage.vo.Pagination;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class EnumInfoServiceImpl implements EnumInfoService {

    @Autowired
    private EnumInfoMapper enumInfoMapper;

    public Map<String, Map<String, EnumInfo>> queryEnumInfosWithKeys(Set<String> keys) {
        if (CollectionUtils.isEmpty(keys)) {
            return new HashMap<>();
        }
        // 最多不可超过20个key
        if (keys.size() > 20) {
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        Map<String, Object> params = new HashMap<>();
        params.put("keys", keys);
        params.put("nonValue", false);
        List<EnumInfo> enumInfos = enumInfoMapper.selectByParams(params);
        if (CollectionUtils.isEmpty(enumInfos)) {
            return new HashMap<>();
        }
        Map<String, Map<String, EnumInfo>> result = new HashMap<>();
        enumInfos.stream().forEach(enumInfo -> {
            Map<String, EnumInfo> temp = result.get(enumInfo.getKey());
            if (temp == null) {
                temp = new HashMap<>();
                result.put(enumInfo.getKey(), temp);
            }
            temp.put(enumInfo.getValue(), enumInfo);
        });
        return result;
    }


    @Override
    public EnumInfoListResponse queryEnumKeys(EnumInfoListRequest request) {
        EnumInfoListResponse response = new EnumInfoListResponse();
        Map<String, Object> params = new HashMap<>();
        params.put("status", StatusEnum.VALID.getCode());
        if (!StringUtils.isEmpty(request.getKey())) {
            params.put("nonValue", false);
            params.put("key", request.getKey());
            List<EnumInfo> enumInfos = enumInfoMapper.selectByParams(params);
            if (!CollectionUtils.isEmpty(enumInfos)) {
                response.setEnumInfoList(enumInfos.stream().map(enumInfo -> {
                    EnumInfoVO enumInfoVO = new EnumInfoVO();
                    BeanUtils.copyProperties(enumInfo, enumInfoVO);
                    return enumInfoVO;
                }).collect(Collectors.toList()));
            }
            return response;
        }
        params.put("nonValue", true);
        params.put("currentIndex", (request.getCurrent() - 1) * request.getPageSize());
        params.put("pageSize", request.getPageSize());
        Pagination pagination = new Pagination();
        pagination.setTotal(enumInfoMapper.countByParams(params));
        pagination.setCurrent(request.getCurrent());
        pagination.setPageSize(request.getPageSize());
        response.setPagination(pagination);
        List<EnumInfo> enumInfos = enumInfoMapper.selectByParams(params);
        if(CollectionUtils.isEmpty(enumInfos)){
            return response;
        }
        List<EnumInfoVO> enumInfoVOS = enumInfos.stream().map(enumInfo -> {
            EnumInfoVO enumInfoVO = new EnumInfoVO();
            BeanUtils.copyProperties(enumInfo, enumInfoVO);
            return enumInfoVO;
        }).collect(Collectors.toList());
        if(!CollectionUtils.isEmpty(enumInfos)){
            Set<String> keys = enumInfos.stream().map(EnumInfo::getKey).collect(Collectors.toSet());
            Map<String, Object> tempParams = new HashMap<>();
            tempParams.put("keys", keys);
            tempParams.put("nonValue", false);
            tempParams.put("status",StatusEnum.VALID.getCode());
            tempParams.put("orderBy","create_time desc");
            List<EnumInfo> children = enumInfoMapper.selectByParams(tempParams);
            if (!CollectionUtils.isEmpty(children)) {
                Map<String,List<EnumInfoVO>> enumInfoVOMap = new HashMap<>();
                children.stream().forEach(enumInfo -> {
                    List<EnumInfoVO> temp = enumInfoVOMap.get(enumInfo.getKey());
                    if(CollectionUtils.isEmpty(temp)){
                        temp = new ArrayList<>();
                        enumInfoVOMap.put(enumInfo.getKey(),temp);
                    }
                    EnumInfoVO enumInfoVO = new EnumInfoVO();
                    BeanUtils.copyProperties(enumInfo,enumInfoVO);
                    temp.add(enumInfoVO);
                });
                enumInfoVOS.stream().forEach(enumInfoVO -> {
                   enumInfoVO.setEnumInfoVOList(enumInfoVOMap.get(enumInfoVO.getKey()));
                });

            }
            response.setEnumInfoList(enumInfoVOS);
        }
        return response;
    }

    @Override
    public int deleteByKey(String key, String value) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)) {
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return enumInfoMapper.deleteByKeyAndValue(key, value);
    }

    @Override
    public EnumInfoAddResponse add(EnumInfoAddRequest request) {
        EnumInfoAddResponse response = new EnumInfoAddResponse();
        EnumInfo enumInfo = new EnumInfo();
        enumInfo.setKey(request.getKey());
        enumInfo.setKeyDesc(request.getKeyDesc());
        enumInfo.setName(request.getName());
        enumInfo.setValue(request.getValue());
        enumInfo.setDesc(request.getDesc());
        enumInfo.setStatus(StatusEnum.VALID.getCode());
        enumInfo.setCreateTime(new Date());
        enumInfo.setUpdateTime(new Date());
        enumInfoMapper.insertSelective(enumInfo);
        response.setEnumInfo(enumInfo);
        return response;
    }
}

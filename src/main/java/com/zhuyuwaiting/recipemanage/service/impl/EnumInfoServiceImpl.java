package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.mapper.EnumInfoMapper;
import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import com.zhuyuwaiting.recipemanage.service.EnumInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;


@Service
public class EnumInfoServiceImpl implements EnumInfoService {

    @Autowired
    private EnumInfoMapper enumInfoMapper;

    public Map<String, Map<String,EnumInfo>> queryEnumInfosWithKeys(Set<String> keys){
        if(CollectionUtils.isEmpty(keys)){
            return new HashMap<>();
        }
        // 最多不可超过20个key
        if(keys.size()>20){
            throw  new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        Map<String,Object> params = new HashMap<>();
        params.put("keys",keys);
        List<EnumInfo> enumInfos = enumInfoMapper.selectByParams(params);
        if(CollectionUtils.isEmpty(enumInfos)){
            return new HashMap<>();
        }
        Map<String,Map<String,EnumInfo>> result = new HashMap<>();
        enumInfos.stream().forEach(enumInfo -> {
            Map<String,EnumInfo> temp = result.get(enumInfo.getKey());
            if(temp == null){
                temp = new HashMap<>();
                result.put(enumInfo.getKey(),temp);
            }
            temp.put(enumInfo.getValue(),enumInfo);
        });
        return result;
    }
}

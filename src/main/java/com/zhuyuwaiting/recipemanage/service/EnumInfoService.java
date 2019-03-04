package com.zhuyuwaiting.recipemanage.service;

import com.zhuyuwaiting.recipemanage.model.EnumInfo;

import java.util.Map;
import java.util.Set;

public interface EnumInfoService {

    /**
     * 根据key获取相应的所有enum的值
     * @param keys
     * @return
     */
    Map<String, Map<String,EnumInfo>> queryEnumInfosWithKeys(Set<String> keys);
}

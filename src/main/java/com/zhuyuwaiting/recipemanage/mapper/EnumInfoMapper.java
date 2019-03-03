package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.EnumInfo;

public interface EnumInfoMapper {
    int insert(EnumInfo record);

    int insertSelective(EnumInfo record);
}
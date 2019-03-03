package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.RecipeInfo;

public interface RecipeInfoMapper {
    int insert(RecipeInfo record);

    int insertSelective(RecipeInfo record);
}
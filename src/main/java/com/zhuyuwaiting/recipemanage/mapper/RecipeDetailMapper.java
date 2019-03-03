package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.RecipeDetail;

public interface RecipeDetailMapper {
    int insert(RecipeDetail record);

    int insertSelective(RecipeDetail record);
}
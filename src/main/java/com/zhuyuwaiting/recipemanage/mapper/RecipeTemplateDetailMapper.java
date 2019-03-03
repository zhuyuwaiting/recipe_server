package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.RecipeTemplateDetail;

public interface RecipeTemplateDetailMapper {
    int insert(RecipeTemplateDetail record);

    int insertSelective(RecipeTemplateDetail record);
}
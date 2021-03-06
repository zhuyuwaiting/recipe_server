package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.RecipeTemplateDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecipeTemplateDetailMapper {
    int insert(RecipeTemplateDetail record);

    int insertSelective(RecipeTemplateDetail record);

    int batchInsert(List<RecipeTemplateDetail> records);

    int updateBySelective(RecipeTemplateDetail recipeTemplateDetail);

    List<RecipeTemplateDetail> selectByParams(Map params);

    int countByParams(Map params);

    int deleteByRecipeTemplateNos(@Param("nos") List<String> nos);
}
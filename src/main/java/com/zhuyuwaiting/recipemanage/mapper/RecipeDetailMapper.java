package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.RecipeDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecipeDetailMapper {
    int insert(RecipeDetail record);

    int insertSelective(RecipeDetail record);


    int updateBySelective(RecipeDetail recipeDetail);

    List<RecipeDetail> selectByParams(Map params);

    int countByParams(Map params);
}
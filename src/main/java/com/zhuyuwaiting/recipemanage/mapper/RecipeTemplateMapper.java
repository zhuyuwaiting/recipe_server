package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.Medicine;
import com.zhuyuwaiting.recipemanage.model.RecipeTemplate;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecipeTemplateMapper {
    int insert(RecipeTemplate record);

    int insertSelective(RecipeTemplate record);

    int deleteByNos(@Param("nos") List<String> nos);

    RecipeTemplate selelctByNo(String no);

    int updateBySelective(RecipeTemplate recipeTemplate);

    List<RecipeTemplate> selectByParams(Map params);

    int countByParams(Map params);
}
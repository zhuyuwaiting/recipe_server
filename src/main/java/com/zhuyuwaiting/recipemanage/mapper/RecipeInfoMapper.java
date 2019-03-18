package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.RecipeInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecipeInfoMapper {
    int insert(RecipeInfo record);

    int insertSelective(RecipeInfo record);

    int deleteByNos(@Param("nos") List<String> nos);

    RecipeInfo selelctByNo(String no);

    int updateBySelective(RecipeInfo recipeInfo);

    List<RecipeInfo> selectByParams(Map params);

    int countByParams(Map params);
}
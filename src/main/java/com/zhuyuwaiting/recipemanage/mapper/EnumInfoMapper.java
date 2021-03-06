package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EnumInfoMapper {
    int insert(EnumInfo record);

    int insertSelective(EnumInfo record);

    int updateBySelective(EnumInfo record);

    List<EnumInfo> selectByParams(Map params);

    int countByParams(Map params);

    int deleteByKeyAndName(@Param("key") String key,@Param("name") String name);

    EnumInfo selectByKeyAndName(@Param("key") String key,@Param("name") String name);
}
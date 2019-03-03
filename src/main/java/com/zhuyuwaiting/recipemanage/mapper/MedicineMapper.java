package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.Medicine;

import java.util.List;
import java.util.Map;

public interface MedicineMapper {
    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByParams(Map params);

    int countByParams(Map params);
}
package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.Medicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MedicineMapper {
    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByParams(Map params);

    int countByParams(Map params);

    int deleteByMedicineNo(@Param("medicineNos")List<String> medicineNos);

    Medicine selelctByMedicineNo(String medicineNo);
    List<Medicine> selelctByMedicineNos(@Param("medicineNos")List<String> medicineNos);

    int updateBySelective(Medicine medicine);
}
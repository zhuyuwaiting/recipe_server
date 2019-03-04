package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  MedicineResultEnum implements ResultEnum{

    MEDICINE_ENUM_QUERY_ERROR("MEDICINE_ENUM_QUERY_ERROR","药品枚举信息查询错误"),


    ;

    private String code;

    private String desc;

}
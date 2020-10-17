package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  MedicineResultEnum implements ResultEnum{

    MEDICINE_ENUM_QUERY_ERROR("MEDICINE_ENUM_QUERY_ERROR","药品枚举信息查询错误"),

    MEDICINE_ADD_ERROR("MEDICINE_ADD_ERROR","增加药品失败"),

    MEDICINE_NAME_EXIST("MEDICINE_NAME_EXIST","该药品名称已经存在")
    ;

    private String code;

    private String desc;

}
package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumInfoResultEnum implements ResultEnum{

    ENUM_INFO_KEY_VALUE_EXIST("ENUM_INFO_KEY_VALUE_EXIST","改key下value已經存在"),

    ENUM_INFO_KEY_VALUE_EXIST_BAK("ENUM_INFO_KEY_VALUE_EXIST_BAK","改key下value已經存在（删除后作为备份存在）"),
    ;

    private String code;

    private String desc;

}
package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  SceneNoEnum {
    MEDICINE_NO("MEDICINE_NO","01","药品编号"),

    ;
    private String code;
    private String num;
    private String desc;
}
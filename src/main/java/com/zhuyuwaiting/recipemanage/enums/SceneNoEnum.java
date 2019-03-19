package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  SceneNoEnum {
    MEDICINE_NO("MEDICINE_NO","01","药品编号"),

    RECIPE_TEMPLATE_NO("RECIPE_TEMPLATE_NO","02","处方模板编号"),

    RECIPE_NO("RECIPE_NO","03","处方编号"),
    ;
    private String code;
    private String num;
    private String desc;
}
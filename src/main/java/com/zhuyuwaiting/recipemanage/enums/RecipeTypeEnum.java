package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  RecipeTypeEnum {
    CHINESE("CHINESE","中药处方"),
    WESTERN("WESTERN","西药处方"),

            ;
    private String code;
    private String desc;

    public static RecipeTypeEnum getByCode(String code){
        for (RecipeTypeEnum typeEnum : values()){
            if(StringUtils.equals(typeEnum.getCode(),code)){
                return typeEnum;
            }
        }
        return null;
    }
}

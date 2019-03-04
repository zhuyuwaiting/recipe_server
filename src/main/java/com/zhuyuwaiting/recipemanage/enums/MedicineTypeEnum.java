package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  MedicineTypeEnum {
    CHINESE_MEDICINE("CHINESE_MEDICINE","中药"),
    WESTERN_MEDICINE("WESTERN_MEDICINE","西药"),

    ;
    private String code;
    private String desc;

    public static MedicineTypeEnum getByCode(String code){
        for (MedicineTypeEnum typeEnum : values()){
            if(StringUtils.equals(typeEnum.getCode(),code)){
                return typeEnum;
            }
        }
        return null;
    }
}


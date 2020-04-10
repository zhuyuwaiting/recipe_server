package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  EnumInfoKeyEnum {
    MEDICINE_UNIT_CN("MEDICINE_UNIT_CN","中药单位"),
    MEDICINE_UNIT_EN("MEDICINE_UNIT_EN","西药单位"),
    MEDICINE_CELL_UNIT("MEDICINE_CELL_UNIT","药品基础单元单位"),
    MEDICINE_TAKING_WAY_CN("MEDICINE_TAKING_WAY_CN","中药服用方式"),
    MEDICINE_TAKING_WAY_EN("MEDICINE_TAKING_WAY_EN","西药服用方式"),
    MEDICINE_FREQUENCY("MEDICINE_FREQUENCY","用药频次"),
    MEDICAL_ADVICE("MEDICAL_ADVICE","医嘱"),


    ;
    private String code;
    private String desc;

    public static EnumInfoKeyEnum getByCode(String code){
        for (EnumInfoKeyEnum typeEnum : values()){
            if(StringUtils.equals(typeEnum.getCode(),code)){
                return typeEnum;
            }
        }
        return null;
    }
}
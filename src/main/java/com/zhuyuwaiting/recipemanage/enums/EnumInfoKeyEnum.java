package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  EnumInfoKeyEnum {
    MEDICINE_UNIT("MEDICINE_UNIT","药品单位"),
    MEDICINE_CELL_UNIT("MEDICINE_CELL_UNIT","药品基础单元单位"),
    MEDICINE_TAKING_WAY("MEDICINE_TAKING_WAY","药品服用方式"),
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
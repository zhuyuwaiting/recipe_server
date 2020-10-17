package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  AgeTypeEnum {
    YEAR("YEAR","岁"),
    MONTH("MONTH","月"),
    DAY("DAY","天"),
    ;
    private String code;
    private String desc;

    public static AgeTypeEnum getByCode(String code){
        for (AgeTypeEnum typeEnum : values()){
            if(StringUtils.equals(typeEnum.getCode(),code)){
                return typeEnum;
            }
        }
        return null;
    }
}

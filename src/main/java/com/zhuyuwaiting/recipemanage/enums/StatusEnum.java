package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum  StatusEnum {
    VALID("VALID","有效"),
    INVALID("INVALID","失效"),
    ;
    private String code;
    private String desc;
}

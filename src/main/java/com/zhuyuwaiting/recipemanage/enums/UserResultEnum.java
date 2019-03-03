package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserResultEnum implements ResultEnum{

    LOGIN_ERROR("LOGIN_ERROR","用户名或密码错误"),

    PARAM_ERROR("PARAM_ERROR","参数错误"),


    ;

    private String code;

    private String desc;

}

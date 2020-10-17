package com.zhuyuwaiting.recipemanage.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  CommonResultEnum implements ResultEnum{

    SYSTEM_ERROR("SYSTEM_ERROR","人气大爆发，请稍后重试"),

    PARAM_ERROR("PARAM_ERROR","参数错误"),

    NO_SESSION("NO_SESSION","未登录"),
    DELETE_NO_PASS("DELETE_NO_PASS","删除失败"),


    ;

    private String code;

    private String desc;

}

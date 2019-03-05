package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnumInfoAddRequest extends BaseRequest {
    private String key;

    private String value;

    private String name;
}

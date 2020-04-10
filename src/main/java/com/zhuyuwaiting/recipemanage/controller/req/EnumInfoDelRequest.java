package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnumInfoDelRequest extends BaseRequest {
    private String key;

    private String name;
}

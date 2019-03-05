package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnumInfoListRequest extends BasePaginationRequest {
    private String key;
}

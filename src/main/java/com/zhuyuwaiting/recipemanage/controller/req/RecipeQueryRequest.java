package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RecipeQueryRequest extends BaseRequest {
    private String recipeNo;
}

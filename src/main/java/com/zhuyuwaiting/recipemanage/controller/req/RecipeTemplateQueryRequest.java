package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RecipeTemplateQueryRequest extends BaseRequest {
    private String recipeTemplateNo;
}

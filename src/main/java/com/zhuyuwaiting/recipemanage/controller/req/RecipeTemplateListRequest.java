package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeTemplateListRequest extends BasePaginationRequest {

    private String recipeTemplateNo;

    private String recipeType;

    private String disease;

    private String classfication;

    private String status = "VALID";
}

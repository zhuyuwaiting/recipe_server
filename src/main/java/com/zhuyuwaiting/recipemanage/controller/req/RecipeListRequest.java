package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeListRequest extends BasePaginationRequest {

    private String recipeNo;

    private String recipeType;

    private String patientName;

    private String disease;

}

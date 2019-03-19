package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeTemplateUpdateResponse extends BaseResponse {
    private RecipeTemplateVO recipeTemplateVO;
}

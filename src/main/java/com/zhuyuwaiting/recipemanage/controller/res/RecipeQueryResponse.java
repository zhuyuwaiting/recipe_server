package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.RecipeInfoVO;
import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateVO;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RecipeQueryResponse extends BasePaginationResponse {

    private RecipeInfoVO recipeInfoVO;

}

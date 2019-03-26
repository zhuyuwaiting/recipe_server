package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.RecipeInfoVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeAddResponse extends BaseResponse {
    private RecipeInfoVO recipeInfoVO;

}

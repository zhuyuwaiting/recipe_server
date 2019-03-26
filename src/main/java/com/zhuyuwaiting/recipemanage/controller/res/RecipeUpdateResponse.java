package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.RecipeInfoVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeUpdateResponse extends BaseResponse  {
    private RecipeInfoVO recipeInfoVO;
}

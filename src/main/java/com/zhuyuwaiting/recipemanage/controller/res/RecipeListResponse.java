package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.RecipeInfoVO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RecipeListResponse extends BasePaginationResponse {

    private List<RecipeInfoVO> recipeInfoVOS;

}

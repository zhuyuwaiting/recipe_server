package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateVO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecipeTemplateListResponse extends BasePaginationResponse {

    private List<RecipeTemplateVO> recipeTemplateVOS;

}

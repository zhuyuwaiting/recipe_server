package com.zhuyuwaiting.recipemanage.controller.req;

import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateDetailVO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecipeTemplateUpdateRequest extends BaseRequest {
    private String recipeTemplateNo;

    private String disease;

    private String classfication;

    private List<RecipeTemplateDetailVO> recipeTemplateDetailVOS;
}

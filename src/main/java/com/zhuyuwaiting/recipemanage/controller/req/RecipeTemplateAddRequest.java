package com.zhuyuwaiting.recipemanage.controller.req;

import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateDetailVO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RecipeTemplateAddRequest extends BaseRequest {
    private String recipeType;

    private String disease;

    private String classfication;

    private List<RecipeTemplateDetailVO> recipeTemplateDetailVOS;

}

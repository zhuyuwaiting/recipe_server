package com.zhuyuwaiting.recipemanage.controller.req;

import com.zhuyuwaiting.recipemanage.vo.RecipeDetailVO;
import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateDetailVO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class RecipeUpdateRequest extends BaseRequest {

    private String recipeNo;

    private String patientName;

    private Byte patientSex;
    private String ageType;

    private Integer patientAge;

    private String disease;

    private String classfication;

    private Integer num;

    private List<RecipeDetailVO> recipeDetailVOS;
}

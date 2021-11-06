package com.zhuyuwaiting.recipemanage.controller.req;

import com.zhuyuwaiting.recipemanage.vo.RecipeDetailVO;
import com.zhuyuwaiting.recipemanage.vo.RecipeTemplateDetailVO;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class RecipeAddRequest extends BaseRequest {
    private String recipeType;

    private String patientName;

    private Byte patientSex;

    private Integer patientAge;

    private String payType;
    private String ageType;

    private String disease;

    private String classfication;

    private Integer num;


    private Date createTime;

    private Date updateTime;

    private List<RecipeDetailVO> recipeDetailVOS;

    private String userId;



}

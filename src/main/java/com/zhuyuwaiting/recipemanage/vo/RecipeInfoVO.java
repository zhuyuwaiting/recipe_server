package com.zhuyuwaiting.recipemanage.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class RecipeInfoVO {
    private Integer id;

    private String recipeNo;

    private String recipeType;
    private String ageType;
    private String ageTypeName;

    private String patientName;

    private Byte patientSex;

    private Integer patientAge;

    private String payType;

    private String disease;

    private String classfication;

    private Integer num;

    private String status;

    private Date createTime;

    private Date updateTime;

    private List<RecipeDetailVO> recipeDetailVOS;

}

package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.RecipeTemplateDetail;
import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class RecipeTemplateVO extends ToString {
    private Integer id;

    private String recipeTemplateNo;

    private String recipeType;

    private String disease;

    private String classfication;

    private String status;

    private Date createTime;

    private Date updateTime;

    private List<RecipeTemplateDetailVO> recipeTemplateDetailVOS;
}

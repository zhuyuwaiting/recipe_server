package com.zhuyuwaiting.recipemanage.model;

import java.util.Date;

public class RecipeTemplate {
    private Integer id;

    private String recipeTemplateNo;

    private String recipeType;

    private String disease;

    private String classfication;

    private String status;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecipeTemplateNo() {
        return recipeTemplateNo;
    }

    public void setRecipeTemplateNo(String recipeTemplateNo) {
        this.recipeTemplateNo = recipeTemplateNo == null ? null : recipeTemplateNo.trim();
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType == null ? null : recipeType.trim();
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease == null ? null : disease.trim();
    }

    public String getClassfication() {
        return classfication;
    }

    public void setClassfication(String classfication) {
        this.classfication = classfication == null ? null : classfication.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
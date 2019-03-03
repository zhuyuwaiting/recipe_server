package com.zhuyuwaiting.recipemanage.model;

public class RecipeTemplateDetail {
    private Integer id;

    private String recipeTemplateNo;

    private String medicineNo;

    private Integer medicineNum;

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

    public String getMedicineNo() {
        return medicineNo;
    }

    public void setMedicineNo(String medicineNo) {
        this.medicineNo = medicineNo == null ? null : medicineNo.trim();
    }

    public Integer getMedicineNum() {
        return medicineNum;
    }

    public void setMedicineNum(Integer medicineNum) {
        this.medicineNum = medicineNum;
    }
}
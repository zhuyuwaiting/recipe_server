package com.zhuyuwaiting.recipemanage.model;

public class RecipeDetail {
    private Integer id;

    private String recipeNo;

    private String medicineNo;

    private Integer medicineNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo == null ? null : recipeNo.trim();
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
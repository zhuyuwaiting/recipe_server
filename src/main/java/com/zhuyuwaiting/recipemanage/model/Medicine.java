package com.zhuyuwaiting.recipemanage.model;

import java.util.Date;

public class Medicine {
    private Integer id;

    private String medicineNo;

    private String name;

    private String englishName;

    private String type;

    private String unit;

    private String cellUnit;

    private Integer cellNum;

    private Integer cellWeight;

    private Integer eachDose;

    private String takingWay;

    private Integer dailyTimes;

    private String status;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicineNo() {
        return medicineNo;
    }

    public void setMedicineNo(String medicineNo) {
        this.medicineNo = medicineNo == null ? null : medicineNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getCellUnit() {
        return cellUnit;
    }

    public void setCellUnit(String cellUnit) {
        this.cellUnit = cellUnit == null ? null : cellUnit.trim();
    }

    public Integer getCellNum() {
        return cellNum;
    }

    public void setCellNum(Integer cellNum) {
        this.cellNum = cellNum;
    }

    public Integer getCellWeight() {
        return cellWeight;
    }

    public void setCellWeight(Integer cellWeight) {
        this.cellWeight = cellWeight;
    }

    public Integer getEachDose() {
        return eachDose;
    }

    public void setEachDose(Integer eachDose) {
        this.eachDose = eachDose;
    }

    public String getTakingWay() {
        return takingWay;
    }

    public void setTakingWay(String takingWay) {
        this.takingWay = takingWay == null ? null : takingWay.trim();
    }

    public Integer getDailyTimes() {
        return dailyTimes;
    }

    public void setDailyTimes(Integer dailyTimes) {
        this.dailyTimes = dailyTimes;
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
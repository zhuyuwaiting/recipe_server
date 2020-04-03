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

    private String memo;

    private String spec;
    private String frequency;

    /**
     * 手动定义的unit
     */
    private String unitStr;

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

    /**
     * Getter method for property <tt>memo</tt>.
     *
     * @return property value of memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Setter method for property <tt>memo</tt>.
     *
     * @param memo value to be assigned to property memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter method for property <tt>spec</tt>.
     *
     * @return property value of spec
     */
    public String getSpec() {
        return spec;
    }

    /**
     * Setter method for property <tt>spec</tt>.
     *
     * @param spec value to be assigned to property spec
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * Getter method for property <tt>unitStr</tt>.
     *
     * @return property value of unitStr
     */
    public String getUnitStr() {
        return unitStr;
    }

    /**
     * Setter method for property <tt>unitStr</tt>.
     *
     * @param unitStr value to be assigned to property unitStr
     */
    public void setUnitStr(String unitStr) {
        this.unitStr = unitStr;
    }

    /**
     * Getter method for property <tt>frequency</tt>.
     *
     * @return property value of frequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Setter method for property <tt>frequency</tt>.
     *
     * @param frequency value to be assigned to property frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}

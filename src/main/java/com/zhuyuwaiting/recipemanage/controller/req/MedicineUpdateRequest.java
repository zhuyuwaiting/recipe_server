package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicineUpdateRequest extends BaseRequest {

    private String medicineNo;

    /**
     * 单位
     */
    private String unit;
    /**
     * 基础单元
     */
    private String cellUnit;

    private Integer cellNum;

    private Integer cellWeight;

    private Integer eachDose;

    private String takingWay;

    private Integer dailyTimes;

    private String  name;

    private String englishName;

    private String memo;

    private String spec;
    /**
     * 手动定义的unit
     */
    private String unitStr;

    private String frequency;

    private String medicalAdvice;

}

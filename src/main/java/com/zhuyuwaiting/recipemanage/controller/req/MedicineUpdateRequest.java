package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicineUpdateRequest extends BaseRequest {

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


}

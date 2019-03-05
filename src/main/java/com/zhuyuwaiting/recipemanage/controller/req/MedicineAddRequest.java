package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MedicineAddRequest extends BaseRequest {

    /**
     * 药品编号
     */
    private String medicineNo;

    /**
     * 中文名称
     */
    private String name;

    /**
     * 英文名称
     */
    private String englishName;

    /**
     * 药品类型
     * @see com.zhuyuwaiting.recipemanage.enums.MedicineTypeEnum
     */
    private String type;

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

    private String status;


}

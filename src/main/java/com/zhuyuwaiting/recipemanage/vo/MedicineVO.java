package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MedicineVO extends ToString {

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

}

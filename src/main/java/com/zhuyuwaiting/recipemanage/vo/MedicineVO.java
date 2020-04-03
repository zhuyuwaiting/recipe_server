package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MedicineVO extends ToString {

    /**
     * 药品编号
     */
    private String medicineNo;

    /**
     * 名称
     */
    private String name;

    /**
     * 药品英文名称
     */
    private String englishName;

    /**
     * 药品类型
     * @see com.zhuyuwaiting.recipemanage.enums.MedicineTypeEnum
     */
    private String type;

    /**
     * 药品类型名称
     * @see com.zhuyuwaiting.recipemanage.enums.MedicineTypeEnum
     */
    private String typeName;

    /**
     * 单位
     */
    private String unit;
    /**
     * 单位EnumInfo
     */
    private EnumInfo unitInfo;

    /**
     * 基础单元单位
     */
    private String cellUnit;

    /**
     * 基础单元单位信息
     */
    private EnumInfo cellUnitInfo;

    /**
     * 基础单位构成一单元所需数量
     */
    private Integer cellNum;

    /**
     * 基础单位的量
     */
    private Integer cellWeight;

    /**
     * 每日剂量
     */
    private Integer eachDose;

    /**
     * 服用方式
     */
    private String takingWay;

    /**
     * 服用方式info
     */
    private EnumInfo takingWayInfo;

    /**
     * 每日服用次数
     */
    private Integer dailyTimes;

    /**
     * 状态
     */
    private String status;

    private Date createTime;

    private Date updateTime;

    private String memo;
    private String spec;

    /**
     * 手动定义的unit
     */
    private String unitStr;

    private String frequency;
    private EnumInfo frequencyInfo;

}

package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class EnumInfoVO extends ToString {
    private Integer id;

    private String key;

    private String keyDesc;

    private String value;

    private String name;

    private String desc;

    private String status;

    private Date createTime;

    private Date updateTime;

    private List<EnumInfoVO> enumInfoVOList;
}

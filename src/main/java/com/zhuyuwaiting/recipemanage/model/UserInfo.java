package com.zhuyuwaiting.recipemanage.model;

import lombok.Data;

import java.util.Date;
@Data
public class UserInfo {
    private Integer id;

    private String uid;

    private String username;

    private String password;
    private String roleId;
    private String status;

    private Date createTime;

    private Date updateTime;

    private String nick;
    private String avatar;
}
package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserInfoVO extends ToString {
    private String uid;

    private String username;

    private String password;
    private String roleId;

    private Date createTime;

    private Date updateTime;

    private String nick;
    private String avatar;

}

package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest extends BaseRequest{
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}

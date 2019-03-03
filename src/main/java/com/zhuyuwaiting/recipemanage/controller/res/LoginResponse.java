package com.zhuyuwaiting.recipemanage.controller.res;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse extends BaseResponse {
    /**
     * 角色
     */
    private String currentAuthority;
}

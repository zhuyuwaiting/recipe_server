package com.zhuyuwaiting.recipemanage.controller.res;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutResponse  extends BaseResponse{
    /**
     * 角色
     */
    private String currentAuthority;
}

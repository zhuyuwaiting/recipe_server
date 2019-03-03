package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.UserInfoVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentUserResponse extends BaseResponse{
    /**
     * 当前用户的信息
     */
    private UserInfoVO userInfo;

}

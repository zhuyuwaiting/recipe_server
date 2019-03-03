package com.zhuyuwaiting.recipemanage.service;

import com.zhuyuwaiting.recipemanage.vo.UserInfoVO;

public interface UserService {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    UserInfoVO login(String username, String password);
}

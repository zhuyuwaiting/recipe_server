package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.RecipeManageApplicationTests;
import com.zhuyuwaiting.recipemanage.model.UserInfo;
import com.zhuyuwaiting.recipemanage.service.UserService;
import com.zhuyuwaiting.recipemanage.vo.UserInfoVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

@Component
public class UserInfoImplTest extends RecipeManageApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void login() {
        UserInfoVO userInfo =  userService.login("admin","e10adc3949ba59abbe56e057f20f883e");
        assertTrue(userInfo!=null);
    }
}
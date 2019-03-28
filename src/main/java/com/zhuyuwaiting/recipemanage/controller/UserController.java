package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.req.LoginRequest;
import com.zhuyuwaiting.recipemanage.controller.res.CurrentUserResponse;
import com.zhuyuwaiting.recipemanage.controller.res.LoginResponse;
import com.zhuyuwaiting.recipemanage.controller.res.LogoutResponse;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.enums.UserResultEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.service.UserService;
import com.zhuyuwaiting.recipemanage.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public LoginResponse login(HttpSession session, @RequestBody LoginRequest loginRequest) {
        if (loginRequest == null || StringUtils.isEmpty(loginRequest.getUsername()) ||
                StringUtils.isEmpty(loginRequest.getPassword())) {
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        LoginResponse response = new LoginResponse();
        UserInfoVO userInfo = userService.login(loginRequest.getUsername(), loginRequest.getPassword());
        if (userInfo == null) {
            // 登录失败
            throw new CommonException(UserResultEnum.LOGIN_ERROR);
        }
        session.setAttribute("user", userInfo);
        return response;
    }


    @RequestMapping("/currentUser")
    @ResponseBody
    public CurrentUserResponse currentUser(HttpSession session){
        CurrentUserResponse response = new CurrentUserResponse();
        UserInfoVO userInfoVO = (UserInfoVO) session.getAttribute("user");
        if(userInfoVO==null){
            throw new CommonException(UserResultEnum.LOGIN_ERROR);
        }
        response.setUserInfo(userInfoVO);
        return response;
    }


    @RequestMapping("/logout")
    @ResponseBody
    public LogoutResponse logout(HttpSession session){
        LogoutResponse response = new LogoutResponse();
        session.invalidate();
        response.setCurrentAuthority("guest");
        return response;
    }
}

package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.enums.StatusEnum;
import com.zhuyuwaiting.recipemanage.mapper.UserInfoMapper;
import com.zhuyuwaiting.recipemanage.model.UserInfo;
import com.zhuyuwaiting.recipemanage.service.UserService;
import com.zhuyuwaiting.recipemanage.vo.UserInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoVO login(String username, String password) {
        Map<String,String> params = new HashMap<>();
        params.put("username",username);
        params.put("password",password);
        params.put("status", StatusEnum.VALID.getCode());
        UserInfo userInfo = userInfoMapper.selectByParams(params);
        if(userInfo==null){
            return null;
        }
        UserInfoVO userInfoVO = new UserInfoVO();
        BeanUtils.copyProperties(userInfo,userInfoVO);
        return  userInfoVO;
    }
}

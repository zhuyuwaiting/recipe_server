package com.zhuyuwaiting.recipemanage.mapper;

import com.zhuyuwaiting.recipemanage.model.UserInfo;

import java.util.Map;

public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByParams(Map params);
}
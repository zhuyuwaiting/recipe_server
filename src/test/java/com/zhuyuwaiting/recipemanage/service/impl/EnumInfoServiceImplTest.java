package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.RecipeManageApplicationTests;
import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import com.zhuyuwaiting.recipemanage.service.EnumInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@Component
public class EnumInfoServiceImplTest extends RecipeManageApplicationTests {

    @Autowired
    private EnumInfoService enumInfoService;

    @Test
    public void queryEnumInfosWithKeys() {
        Set<String>  keys = new HashSet<>();
        keys.add("A");
        keys.add("B");
        Map<String, Map<String,EnumInfo>> result = enumInfoService.queryEnumInfosWithKeys(keys);
        System.out.println(result);
    }
}
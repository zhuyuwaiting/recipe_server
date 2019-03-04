package com.zhuyuwaiting.recipemanage.service;

import com.zhuyuwaiting.recipemanage.model.Medicine;
import com.zhuyuwaiting.recipemanage.vo.BasePaginationResult;

import java.util.Map;

public interface MedicineService {

    /**
     * 查询医药列表
     * @param params
     * @return
     */
    public BasePaginationResult<Medicine> list(Map<String,Object> params);
}

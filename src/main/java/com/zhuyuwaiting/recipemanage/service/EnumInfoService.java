package com.zhuyuwaiting.recipemanage.service;

import com.zhuyuwaiting.recipemanage.controller.req.EnumInfoListRequest;
import com.zhuyuwaiting.recipemanage.controller.res.EnumInfoListResponse;
import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import com.zhuyuwaiting.recipemanage.vo.BasePaginationResult;
import com.zhuyuwaiting.recipemanage.vo.Pagination;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface EnumInfoService {

    /**
     * 根据key获取相应的所有enum的值
     * @param keys
     * @return
     */
    Map<String, Map<String,EnumInfo>> queryEnumInfosWithKeys(Set<String> keys);

    /**
     * 分页查询所有enum
     * @param pagination
     * @return
     */
    EnumInfoListResponse queryEnumKeys(EnumInfoListRequest request);

}

package com.zhuyuwaiting.recipemanage.service;

import com.zhuyuwaiting.recipemanage.controller.req.RecipeAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeListRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeUpdateRequest;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeListResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeUpdateResponse;
import com.zhuyuwaiting.recipemanage.vo.RecipeInfoVO;

public interface RecipeService {
    RecipeListResponse list(RecipeListRequest request);

    RecipeAddResponse add(RecipeAddRequest request);

    RecipeDelResponse del(RecipeDelRequest request);

    RecipeInfoVO query(String recipeTemplateNo);

    RecipeUpdateResponse update(RecipeUpdateRequest request);
}

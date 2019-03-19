package com.zhuyuwaiting.recipemanage.service;

import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateListRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateUpdateRequest;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateListResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateUpdateResponse;

public interface RecipeTemplateService {

    RecipeTemplateListResponse list(RecipeTemplateListRequest request);

    RecipeTemplateAddResponse add(RecipeTemplateAddRequest request);

    RecipeTemplateDelResponse del(RecipeTemplateDelRequest request);

    RecipeTemplateUpdateResponse update(RecipeTemplateUpdateRequest request);
}

package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateListRequest;
import com.zhuyuwaiting.recipemanage.controller.req.RecipeTemplateUpdateRequest;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateListResponse;
import com.zhuyuwaiting.recipemanage.controller.res.RecipeTemplateUpdateResponse;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.enums.RecipeTypeEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.service.RecipeTemplateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipeTemplate")
@Slf4j
public class RecipeTemplateController {

    @Autowired
    private RecipeTemplateService recipeTemplateService;

    @RequestMapping("/list")
    @ResponseBody
    public RecipeTemplateListResponse list(RecipeTemplateListRequest request){
        return recipeTemplateService.list(request);
    }

    @RequestMapping("/add")
    @ResponseBody
    public RecipeTemplateAddResponse add(@RequestBody RecipeTemplateAddRequest request){
        // 参数检查
        if(StringUtils.isEmpty(request.getRecipeType()) || RecipeTypeEnum.getByCode(request.getRecipeType())==null){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(StringUtils.isEmpty(request.getDisease())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(StringUtils.isEmpty(request.getClassfication())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(CollectionUtils.isEmpty(request.getRecipeTemplateDetailVOS())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return recipeTemplateService.add(request);
    }


    @RequestMapping("/del")
    @ResponseBody
    public RecipeTemplateDelResponse del(@RequestBody RecipeTemplateDelRequest request){
        if(CollectionUtils.isEmpty(request.getRecipeTemplateNos())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return recipeTemplateService.del(request);
    }


    @RequestMapping("/update")
    @ResponseBody
    public RecipeTemplateUpdateResponse update(@RequestBody RecipeTemplateUpdateRequest request){
        if(CollectionUtils.isEmpty(request.getRecipeTemplateDetailVOS())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return recipeTemplateService.update(request);
    }

}

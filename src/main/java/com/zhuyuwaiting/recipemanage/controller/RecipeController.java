package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.req.*;
import com.zhuyuwaiting.recipemanage.controller.res.*;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.enums.RecipeTypeEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recipe")
@Slf4j
public class RecipeController {

    @Autowired
    private RecipeService recipeService;


    @RequestMapping("/list")
    @ResponseBody
    public RecipeListResponse list(RecipeListRequest request){
        return recipeService.list(request);
    }

    @RequestMapping("/add")
    @ResponseBody
    public RecipeAddResponse add(@RequestBody RecipeAddRequest request){
        // 参数检查
        if(StringUtils.isEmpty(request.getRecipeType()) || RecipeTypeEnum.getByCode(request.getRecipeType())==null){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(StringUtils.isEmpty(request.getDisease())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(StringUtils.isEmpty(request.getPatientName())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(CollectionUtils.isEmpty(request.getRecipeDetailVOS())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return recipeService.add(request);
    }


    @RequestMapping("/del")
    @ResponseBody
    public RecipeDelResponse del(@RequestBody RecipeDelRequest request){
        if(CollectionUtils.isEmpty(request.getRecipeNos())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return recipeService.del(request);
    }


    @RequestMapping("/update")
    @ResponseBody
    public RecipeUpdateResponse update(@RequestBody RecipeUpdateRequest request){
        if(CollectionUtils.isEmpty(request.getRecipeDetailVOS())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return recipeService.update(request);
    }

    @RequestMapping("/query")
    @ResponseBody
    public RecipeQueryResponse query(RecipeQueryRequest request){
        RecipeQueryResponse response = new RecipeQueryResponse();
        if(org.apache.commons.lang3.StringUtils.isEmpty(request.getRecipeNo())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        response.setRecipeInfoVO(recipeService.query(request.getRecipeNo()));
        return response;
    }
}

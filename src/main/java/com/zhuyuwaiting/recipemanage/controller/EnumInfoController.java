package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.req.EnumInfoAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.EnumInfoDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.EnumInfoListRequest;
import com.zhuyuwaiting.recipemanage.controller.res.EnumInfoAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.EnumInfoDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.EnumInfoListResponse;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.service.EnumInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enumInfo")
@Slf4j
public class EnumInfoController {


    @Autowired
    private EnumInfoService enumInfoService;



    @RequestMapping("/del")
    @ResponseBody
    public EnumInfoDelResponse del(@RequestBody EnumInfoDelRequest request){
        if(StringUtils.isEmpty(request.getKey()) || StringUtils.isEmpty(request.getValue())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        int result = enumInfoService.deleteByKey(request.getKey(),request.getValue());
        if(result==0){
            throw new CommonException(CommonResultEnum.DELETE_NO_PASS);
        }
        return new EnumInfoDelResponse();
    }

    @RequestMapping("/add")
    @ResponseBody
    public EnumInfoAddResponse add(@RequestBody EnumInfoAddRequest request){
        if(StringUtils.isEmpty(request.getKey()) || StringUtils.isEmpty(request.getValue())
        || StringUtils.isEmpty(request.getName())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return enumInfoService.add(request);
    }

    @RequestMapping("/list")
    @ResponseBody
    public EnumInfoListResponse list(EnumInfoListRequest request){
        EnumInfoListResponse response = enumInfoService.queryEnumKeys(request);
        return response;
    }
}

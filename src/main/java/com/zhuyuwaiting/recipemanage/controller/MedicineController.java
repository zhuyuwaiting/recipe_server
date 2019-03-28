package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.req.MedicineAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.MedicineDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.MedicineListQueryRequest;
import com.zhuyuwaiting.recipemanage.controller.req.MedicineUpdateRequest;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineListQueryResponse;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineUpdateResponse;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.enums.MedicineTypeEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.service.MedicineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/medicine")
@Slf4j
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @RequestMapping("/list")
    @ResponseBody
    public MedicineListQueryResponse list(MedicineListQueryRequest request){
        MedicineListQueryResponse response = new MedicineListQueryResponse();
        // 参数检查
        if(StringUtils.isEmpty(request.getType()) || MedicineTypeEnum.getByCode(request.getType())==null){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        response = medicineService.list(request);
        return response;
    }

    @RequestMapping("/add")
    @ResponseBody
    public MedicineAddResponse add(@RequestBody  MedicineAddRequest request){
        if(StringUtils.isEmpty(request.getType())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(StringUtils.isEmpty(request.getName())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        if(StringUtils.isEmpty(request.getUnit())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return medicineService.add(request);
    }

    @RequestMapping("/update")
    @ResponseBody
    public MedicineUpdateResponse update(@RequestBody MedicineUpdateRequest request){
        if(StringUtils.isEmpty(request.getMedicineNo())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return medicineService.update(request);
    }


    @RequestMapping("/del")
    @ResponseBody
    public MedicineDelResponse del(@RequestBody MedicineDelRequest request){
        if(CollectionUtils.isEmpty(request.getMedicineNos())){
            throw new CommonException(CommonResultEnum.PARAM_ERROR);
        }
        return medicineService.del(request);
    }
}

package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.req.MedicineListQueryRequest;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineListQueryResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/medicine")
@Slf4j
public class MedicineController {

    @RequestMapping("/list")
    @ResponseBody
    public MedicineListQueryResponse list(MedicineListQueryRequest request){
        MedicineListQueryResponse response = new MedicineListQueryResponse();



        return response;
    }
}

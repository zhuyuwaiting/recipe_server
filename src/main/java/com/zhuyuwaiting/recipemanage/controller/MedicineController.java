package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.res.LogoutResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/medicine")
@Slf4j
public class MedicineController {

    @RequestMapping("logout")
    @ResponseBody
    public LogoutResponse logout(){
        LogoutResponse response = new LogoutResponse();
        response.setCurrentAuthority("guest");
        return response;
    }
}

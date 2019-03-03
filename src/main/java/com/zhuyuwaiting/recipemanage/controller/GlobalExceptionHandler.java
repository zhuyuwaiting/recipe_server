package com.zhuyuwaiting.recipemanage.controller;

import com.zhuyuwaiting.recipemanage.controller.res.BaseResponse;
import com.zhuyuwaiting.recipemanage.enums.CommonResultEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {CommonException.class,RuntimeException.class})
    @ResponseBody
    public BaseResponse exceptionHandler(RuntimeException e){
        log.info(new Date().toString(),e);
        if(e instanceof CommonException){
            return  new BaseResponse(((CommonException) e).getCode(),false,((CommonException) e).getDesc());
        }
        return new BaseResponse(CommonResultEnum.SYSTEM_ERROR);
    }
}

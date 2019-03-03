package com.zhuyuwaiting.recipemanage.exception;

import com.zhuyuwaiting.recipemanage.enums.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonException extends RuntimeException {
    private String code;

    private String desc;

    public CommonException(ResultEnum resultEnum){
        super(resultEnum.getDesc());
        this.code = resultEnum.getCode();
        this.desc = resultEnum.getDesc();
    }
}

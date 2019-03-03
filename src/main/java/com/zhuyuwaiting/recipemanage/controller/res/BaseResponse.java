package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.enums.ResultEnum;
import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse extends ToString {
    /**
     * 错误码
     */
    private String code;

    /**
     * 是否成功
     */
    private boolean success  = true;

    /**
     * 错误描述
     */
    private String desc;

    public BaseResponse(ResultEnum resultEnum){
        this.success = false;
        this.code = resultEnum.getCode();
        this.desc = resultEnum.getDesc();
    }
}

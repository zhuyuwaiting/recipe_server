package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnumInfoAddResponse extends BaseResponse {
    private EnumInfo enumInfo;
}

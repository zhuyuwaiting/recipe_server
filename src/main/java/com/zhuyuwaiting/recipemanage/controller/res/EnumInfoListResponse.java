package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EnumInfoListResponse extends BasePaginationResponse {
    private List<EnumInfo> enumInfoList;
}

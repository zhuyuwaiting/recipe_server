package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.Pagination;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasePaginationResponse extends BaseResponse {
    private Pagination pagination;
}

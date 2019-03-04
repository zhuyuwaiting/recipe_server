package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasePaginationRequest extends BaseRequest {

    /**
     * 总数
     */
    private Integer  total;

    /**
     * 每页数
     */
    private Integer  pageSize = 10;
    /**
     * 当前页码
     */
    private Integer  current  = 1;

}

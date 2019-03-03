package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagination extends ToString {

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

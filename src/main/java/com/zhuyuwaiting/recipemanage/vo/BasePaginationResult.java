package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BasePaginationResult<T> extends ToString {

    private List<T> list;

    private Pagination pagination;

}

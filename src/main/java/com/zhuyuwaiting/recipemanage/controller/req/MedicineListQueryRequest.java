package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicineListQueryRequest extends BasePaginationRequest {

    private String medicineNo;

    private String name;

    private String englishName;

    private String type;


}

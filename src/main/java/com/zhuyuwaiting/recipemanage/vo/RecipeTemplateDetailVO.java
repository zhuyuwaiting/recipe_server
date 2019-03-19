package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeTemplateDetailVO extends ToString {
    private Integer id;

    private String recipeTemplateNo;

    private String medicineNo;

    private Integer medicineNum;

    private MedicineVO medicineVO;

}

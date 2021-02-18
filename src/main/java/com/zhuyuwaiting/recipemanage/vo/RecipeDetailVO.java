package com.zhuyuwaiting.recipemanage.vo;

import com.zhuyuwaiting.recipemanage.model.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeDetailVO extends ToString {
    private Integer id;

    private String recipeNo;

    private String medicineNo;
    private String     medicineAdvice;

    private Integer medicineNum;

    private MedicineVO medicineVO;
}

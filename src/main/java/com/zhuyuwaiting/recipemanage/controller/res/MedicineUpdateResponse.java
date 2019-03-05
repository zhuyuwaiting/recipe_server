package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.MedicineVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicineUpdateResponse extends BaseResponse {

    private MedicineVO medicineVO;
}

package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.MedicineVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicineAddResponse extends BaseResponse {

    /**
     * 新增的medicine对象
     */
    private MedicineVO medicineVO;
}

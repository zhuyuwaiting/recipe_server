package com.zhuyuwaiting.recipemanage.controller.req;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class MedicineDelRequest extends BaseRequest {

    private List<String> medicineNos;

}

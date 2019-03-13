package com.zhuyuwaiting.recipemanage.controller.res;

import com.zhuyuwaiting.recipemanage.vo.EnumInfoVO;
import com.zhuyuwaiting.recipemanage.vo.MedicineVO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class MedicineListQueryResponse extends BasePaginationResponse {

    private List<MedicineVO> medicineVOS;

    private Map<String,List<EnumInfoVO>> enumInfos;

}

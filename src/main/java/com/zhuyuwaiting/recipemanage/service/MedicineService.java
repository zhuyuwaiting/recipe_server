package com.zhuyuwaiting.recipemanage.service;

import com.zhuyuwaiting.recipemanage.controller.req.MedicineAddRequest;
import com.zhuyuwaiting.recipemanage.controller.req.MedicineDelRequest;
import com.zhuyuwaiting.recipemanage.controller.req.MedicineListQueryRequest;
import com.zhuyuwaiting.recipemanage.controller.req.MedicineUpdateRequest;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineAddResponse;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineDelResponse;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineListQueryResponse;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineUpdateResponse;
import com.zhuyuwaiting.recipemanage.model.Medicine;
import com.zhuyuwaiting.recipemanage.vo.BasePaginationResult;
import com.zhuyuwaiting.recipemanage.vo.MedicineVO;

import java.util.List;
import java.util.Map;

public interface MedicineService {

    /**
     * 查询医药列表
     * @param params
     * @return
     */
    public BasePaginationResult<Medicine> list(Map<String,Object> params);


    /**
     * 查询药品列表
     * @param request
     * @return
     */
    MedicineListQueryResponse list(MedicineListQueryRequest request);

    MedicineDelResponse del(MedicineDelRequest request);

    MedicineUpdateResponse update(MedicineUpdateRequest request);

    MedicineVO selectByMedicineNo(String medicineNo);
    List<MedicineVO> selectByMedicineNos(List<String> medicineNo);

    MedicineAddResponse add(MedicineAddRequest request);
}

package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.mapper.MedicineMapper;
import com.zhuyuwaiting.recipemanage.model.Medicine;
import com.zhuyuwaiting.recipemanage.service.MedicineService;
import com.zhuyuwaiting.recipemanage.vo.BasePaginationResult;
import com.zhuyuwaiting.recipemanage.vo.Pagination;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    /**
     * 查询医药列表
     * @param params
     * @return
     */
    public BasePaginationResult<Medicine> list(Map<String,String> params){
        List<Medicine>  list = medicineMapper.selectByParams(params);
        int count = medicineMapper.countByParams(params);
        BasePaginationResult result = new BasePaginationResult();
        result.setList(list);
        Pagination pagination = new Pagination();
        pagination.setTotal(count);
        result.setPagination(pagination);
        return result;
    }

}

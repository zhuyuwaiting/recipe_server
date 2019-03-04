package com.zhuyuwaiting.recipemanage.service.impl;

import com.zhuyuwaiting.recipemanage.controller.req.MedicineListQueryRequest;
import com.zhuyuwaiting.recipemanage.controller.res.MedicineListQueryResponse;
import com.zhuyuwaiting.recipemanage.enums.EnumInfoKeyEnum;
import com.zhuyuwaiting.recipemanage.enums.MedicineResultEnum;
import com.zhuyuwaiting.recipemanage.enums.MedicineTypeEnum;
import com.zhuyuwaiting.recipemanage.enums.StatusEnum;
import com.zhuyuwaiting.recipemanage.exception.CommonException;
import com.zhuyuwaiting.recipemanage.mapper.MedicineMapper;
import com.zhuyuwaiting.recipemanage.model.EnumInfo;
import com.zhuyuwaiting.recipemanage.model.Medicine;
import com.zhuyuwaiting.recipemanage.service.EnumInfoService;
import com.zhuyuwaiting.recipemanage.service.MedicineService;
import com.zhuyuwaiting.recipemanage.vo.BasePaginationResult;
import com.zhuyuwaiting.recipemanage.vo.MedicineVO;
import com.zhuyuwaiting.recipemanage.vo.Pagination;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    @Autowired
    private EnumInfoService enumInfoService;

    /**
     * 查询医药列表
     *
     * @param params
     * @return
     */
    public BasePaginationResult<Medicine> list(Map<String, Object> params) {
        List<Medicine> list = medicineMapper.selectByParams(params);
        int count = medicineMapper.countByParams(params);
        BasePaginationResult result = new BasePaginationResult();
        result.setList(list);
        Pagination pagination = new Pagination();
        pagination.setTotal(count);
        result.setPagination(pagination);
        return result;
    }

    /**
     * 查询医药列表
     *
     * @param request
     * @return
     */
    public MedicineListQueryResponse list(MedicineListQueryRequest request) {
        MedicineListQueryResponse response = new MedicineListQueryResponse();
        Map<String, Object> params = new HashMap<>();
        params.put("medicineNo", request.getMedicineNo());
        params.put("englishName", request.getEnglishName());
        params.put("name", request.getName());
        params.put("type", request.getType());
        params.put("status", StatusEnum.VALID.getCode());
        params.put("currentIndex", (request.getCurrent() - 1) * request.getPageSize());
        params.put("pageSize", request.getPageSize());
        List<Medicine> list = medicineMapper.selectByParams(params);
        int count = medicineMapper.countByParams(params);
        Pagination pagination = new Pagination();
        pagination.setTotal(count);
        pagination.setCurrent(request.getCurrent());
        pagination.setPageSize(request.getPageSize());
        response.setPagination(pagination);
        if (CollectionUtils.isEmpty(list)) {
            return response;
        }
        List<MedicineVO> medicineVOS = list.stream().map(medicine -> {
            MedicineVO medicineVO = new MedicineVO();
            BeanUtils.copyProperties(medicine, medicineVO);
            //设置类型名称
            if (MedicineTypeEnum.getByCode(medicineVO.getType()) != null) {
                medicineVO.setTypeName(MedicineTypeEnum.getByCode(medicineVO.getType()).getCode());
            }
            return medicineVO;
        }).collect(Collectors.toList());
        //获取enumInfos
        assebleMedicineEnumInfo(medicineVOS);
        response.setMedicineVOS(medicineVOS);
        return response;
    }


    /**
     * 组装药品枚举信息
     */
    private void assebleMedicineEnumInfo(List<MedicineVO> medicineVOS) {
        if (CollectionUtils.isEmpty(medicineVOS)) {
            return;
        }
        Set<String> keys = new HashSet<>();
        keys.add(EnumInfoKeyEnum.MEDICINE_CELL_UNIT.getCode());
        keys.add(EnumInfoKeyEnum.MEDICINE_UNIT.getCode());
        keys.add(EnumInfoKeyEnum.MEDICINE_TAKING_WAY.getCode());
        Map<String, Map<String, EnumInfo>> enumInfoMap = enumInfoService.queryEnumInfosWithKeys(keys);
        if (CollectionUtils.isEmpty(enumInfoMap)) {
            throw new CommonException(MedicineResultEnum.MEDICINE_ENUM_QUERY_ERROR);
        }

        medicineVOS.stream().forEach(medicineVO -> {
            if (!StringUtils.isEmpty(medicineVO.getUnit())
                    && enumInfoMap.get(EnumInfoKeyEnum.MEDICINE_UNIT.getCode()) != null) {
                medicineVO.setUnitInfo(enumInfoMap.get(EnumInfoKeyEnum.MEDICINE_UNIT.getCode()).get(medicineVO.getUnit()));
            }
            if (!StringUtils.isEmpty(medicineVO.getCellUnit())
                    && enumInfoMap.get(EnumInfoKeyEnum.MEDICINE_CELL_UNIT.getCode()) != null) {
                medicineVO.setCellUnitInfo(enumInfoMap.get(EnumInfoKeyEnum.MEDICINE_CELL_UNIT.getCode()).get(medicineVO.getCellUnit()));
            }
            if (!StringUtils.isEmpty(medicineVO.getTakingWay())
                    && enumInfoMap.get(EnumInfoKeyEnum.MEDICINE_TAKING_WAY.getCode()) != null) {
                medicineVO.setTakingWayInfo(enumInfoMap.get(EnumInfoKeyEnum.MEDICINE_TAKING_WAY.getCode()).get(medicineVO.getTakingWay()));
            }
        });
    }

}

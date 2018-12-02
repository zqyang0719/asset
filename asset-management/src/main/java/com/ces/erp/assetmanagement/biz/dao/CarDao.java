package com.ces.erp.assetmanagement.biz.dao;

import com.ces.erp.assetmanagement.base.mapper.BaseMapper;
import com.ces.erp.assetmanagement.biz.entity.CarEntity;
import com.ces.erp.assetmanagement.common.model.ConditionQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarDao extends BaseMapper<CarEntity> {
    void insertCar(CarEntity car);

    void updateCar(CarEntity car);

    void deleteCar(CarEntity car);

    List<CarEntity> getCarListByPage(@Param("query")ConditionQuery query);
}
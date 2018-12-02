package com.ces.erp.assetmanagement.biz.service;

import com.ces.erp.assetmanagement.biz.entity.CarEntity;
import com.ces.erp.assetmanagement.common.model.ConditionQuery;
import com.github.pagehelper.PageInfo;

public interface ICarService {
    CarEntity saveCar(CarEntity car);

    void deleteCar(CarEntity car);

    PageInfo<CarEntity> getCarListByPage(ConditionQuery query);
}

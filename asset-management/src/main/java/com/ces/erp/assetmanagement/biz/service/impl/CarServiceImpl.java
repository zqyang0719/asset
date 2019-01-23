package com.ces.erp.assetmanagement.biz.service.impl;

import com.ces.erp.annotation.CustomLogger;
import com.ces.erp.assetmanagement.biz.dao.CarDao;
import com.ces.erp.assetmanagement.biz.entity.CarEntity;
import com.ces.erp.assetmanagement.biz.service.ICarService;
import com.ces.erp.assetmanagement.common.model.ConditionQuery;
import com.ces.erp.assetmanagement.common.model.Constant;
import com.ces.erp.assetmanagement.common.util.CommonUtils;
import com.ces.erp.assetmanagement.common.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private CarDao carDao;

    @Override
    @CustomLogger
    public CarEntity saveCar(CarEntity car) {
        if(StringUtils.isNullOrEmpty(car.getId())){
            car.setId(CommonUtils.createId());
            carDao.insertCar(car);
        }else{
            carDao.updateCar(car);
        }
        return car;
    }

    @Override
    public void deleteCar(CarEntity car) {
        car.setIsDelete(Constant.DataStatus.DELETE);
        carDao.deleteCar(car);
    }

    @Override
    public PageInfo<CarEntity> getCarListByPage(ConditionQuery query) {
        PageHelper.startPage(query.getPageNumber(), query.getPageSize());
        List<CarEntity> list = carDao.getCarListByPage(query);
        PageInfo<CarEntity> page = new PageInfo<CarEntity>(list);
        return page;
    }
}

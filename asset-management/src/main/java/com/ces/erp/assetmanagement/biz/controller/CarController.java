package com.ces.erp.assetmanagement.biz.controller;

import com.ces.erp.assetmanagement.base.entity.ResultInfo;
import com.ces.erp.assetmanagement.biz.entity.CarEntity;
import com.ces.erp.assetmanagement.biz.service.ICarService;
import com.ces.erp.assetmanagement.common.model.ConditionQuery;
import com.ces.erp.assetmanagement.common.model.Constant;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    public ICarService carService;

    @RequestMapping(method = RequestMethod.POST)
    public ResultInfo saveCar(@RequestBody CarEntity car){
        ResultInfo resultInfo = new ResultInfo();
        try {
            CarEntity saved = carService.saveCar(car);
            if(saved == null) {
                resultInfo.setStatus(Constant.Result.ERROR);
                resultInfo.setData(car);
            } else {
                resultInfo.setStatus(Constant.Result.SUCCESS);
                resultInfo.setData(saved);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            resultInfo.setStatus(Constant.Result.ERROR);
            resultInfo.setErrorMsg("保存车辆信息失败");
        }
        return resultInfo;
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResultInfo getCar(String id){
       return null;
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public ResultInfo deleteCar(@RequestBody CarEntity car){
        ResultInfo resultInfo = new ResultInfo();
        try {
            carService.deleteCar(car);
            resultInfo.setStatus(Constant.Result.SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            resultInfo.setStatus(Constant.Result.ERROR);
            resultInfo.setErrorMsg("删除车辆信息失败");
        }
        return resultInfo;
    }

    @RequestMapping("/getCarList")
    public ResultInfo getCarList(@RequestBody ConditionQuery query){
        ResultInfo resultInfo = new ResultInfo();
        try {
            PageInfo<CarEntity> page = carService.getCarListByPage(query);
            resultInfo.setStatus(Constant.Result.SUCCESS);
            resultInfo.setData(page);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            resultInfo.setStatus(Constant.Result.ERROR);
            resultInfo.setErrorMsg("查询车辆信息失败");
        }
        return resultInfo;
    }

}

package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 车辆实体类
 */
@Table(name = "t_am_car")
public class CarEntity extends BaseEntity{
    /**
     * car_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 序号
     */
    @Column(name = "car_no")
    private String carNo;

    /**
     * 车辆名称
     */
    @Column(name = "car_name")
    private String carName;

    /**
     * 车辆型号
     */
    @Column(name = "vehicle_model")
    private String vehicleModel;

    /**
     * 车辆类型
     */
    @Column(name = "vehicle_type")
    private String vehicleType;

    /**
     * 购买时间
     */
    @Column(name = "buy_time")
    private String buyTime;

    /**
     * 账面原值
     */
    @Column(name = "original_value")
    private Double originalValue;

    /**
     * 账面净值
     */
    @Column(name = "book_value")
    private Double bookValue;

    /**
     * 行驶公里数
     */
    private Double mileage;

    /**
     * 隶属公司
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取car_id
     *
     * @return id - car_id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置car_id
     *
     * @param id car_id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取序号
     *
     * @return car_no - 序号
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 设置序号
     *
     * @param carNo 序号
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    /**
     * 获取车辆名称
     *
     * @return car_name - 车辆名称
     */
    public String getCarName() {
        return carName;
    }

    /**
     * 设置车辆名称
     *
     * @param carName 车辆名称
     */
    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    /**
     * 获取车辆型号
     *
     * @return vehicle_model - 车辆型号
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * 设置车辆型号
     *
     * @param vehicleModel 车辆型号
     */
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel == null ? null : vehicleModel.trim();
    }

    /**
     * 获取车辆类型
     *
     * @return vehicle_type - 车辆类型
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置车辆类型
     *
     * @param vehicleType 车辆类型
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType == null ? null : vehicleType.trim();
    }

    /**
     * 获取购买时间
     *
     * @return buy_time - 购买时间
     */
    public String getBuyTime() {
        return buyTime;
    }

    /**
     * 设置购买时间
     *
     * @param buyTime 购买时间
     */
    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime == null ? null : buyTime.trim();
    }

    /**
     * 获取账面原值
     *
     * @return original_value - 账面原值
     */
    public Double getOriginalValue() {
        return originalValue;
    }

    /**
     * 设置账面原值
     *
     * @param originalValue 账面原值
     */
    public void setOriginalValue(Double originalValue) {
        this.originalValue = originalValue;
    }

    /**
     * 获取账面净值
     *
     * @return book_value - 账面净值
     */
    public Double getBookValue() {
        return bookValue;
    }

    /**
     * 设置账面净值
     *
     * @param bookValue 账面净值
     */
    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    /**
     * 获取行驶公里数
     *
     * @return mileage - 行驶公里数
     */
    public Double getMileage() {
        return mileage;
    }

    /**
     * 设置行驶公里数
     *
     * @param mileage 行驶公里数
     */
    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    /**
     * 获取隶属公司
     *
     * @return company_id - 隶属公司
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置隶属公司
     *
     * @param companyId 隶属公司
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import java.util.Date;
import javax.persistence.*;

/**
 * 房地产信息
 */
@Table(name = "t_am_estate")
public class EstateEntity extends BaseEntity{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * company_id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 名称
     */
    private String name;

    /**
     * 房地坐落地址
     */
    private String address;

    /**
     * 宗地使用权来源
     */
    private String source;

    /**
     * 使用权取得方式
     */
    @Column(name = "acquire_way")
    private String acquireWay;

    /**
     * 宗地号
     */
    @Column(name = "land_number")
    private String landNumber;

    /**
     * 宗地用途
     */
    @Column(name = "land_use")
    private String landUse;

    /**
     * 宗地面积
     */
    @Column(name = "land_area")
    private String landArea;

    /**
     * 房屋建筑面积
     */
    @Column(name = "building_area")
    private String buildingArea;

    /**
     * 房屋建筑类型
     */
    @Column(name = "building_type")
    private String buildingType;

    /**
     * 房屋建筑用途
     */
    @Column(name = "building_use")
    private String buildingUse;

    /**
     * 权证号
     */
    @Column(name = "warrant_number")
    private String warrantNumber;

    /**
     * 产权人
     */
    private String owner;

    /**
     * 限制信息
     */
    private String restriction;

    /**
     * 使用情况
     */
    @Column(name = "use_situation")
    private String useSituation;

    /**
     * 使用人
     */
    private String user;

    /**
     * 备注
     */
    private String remark;


    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取company_id
     *
     * @return company_id - company_id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置company_id
     *
     * @param companyId company_id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取房地坐落地址
     *
     * @return address - 房地坐落地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置房地坐落地址
     *
     * @param address 房地坐落地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取宗地使用权来源
     *
     * @return source - 宗地使用权来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置宗地使用权来源
     *
     * @param source 宗地使用权来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取使用权取得方式
     *
     * @return acquire_way - 使用权取得方式
     */
    public String getAcquireWay() {
        return acquireWay;
    }

    /**
     * 设置使用权取得方式
     *
     * @param acquireWay 使用权取得方式
     */
    public void setAcquireWay(String acquireWay) {
        this.acquireWay = acquireWay == null ? null : acquireWay.trim();
    }

    /**
     * 获取宗地号
     *
     * @return land_number - 宗地号
     */
    public String getLandNumber() {
        return landNumber;
    }

    /**
     * 设置宗地号
     *
     * @param landNumber 宗地号
     */
    public void setLandNumber(String landNumber) {
        this.landNumber = landNumber == null ? null : landNumber.trim();
    }

    /**
     * 获取宗地用途
     *
     * @return land_use - 宗地用途
     */
    public String getLandUse() {
        return landUse;
    }

    /**
     * 设置宗地用途
     *
     * @param landUse 宗地用途
     */
    public void setLandUse(String landUse) {
        this.landUse = landUse == null ? null : landUse.trim();
    }

    /**
     * 获取宗地面积
     *
     * @return land_area - 宗地面积
     */
    public String getLandArea() {
        return landArea;
    }

    /**
     * 设置宗地面积
     *
     * @param landArea 宗地面积
     */
    public void setLandArea(String landArea) {
        this.landArea = landArea == null ? null : landArea.trim();
    }

    /**
     * 获取房屋建筑面积
     *
     * @return building_area - 房屋建筑面积
     */
    public String getBuildingArea() {
        return buildingArea;
    }

    /**
     * 设置房屋建筑面积
     *
     * @param buildingArea 房屋建筑面积
     */
    public void setBuildingArea(String buildingArea) {
        this.buildingArea = buildingArea == null ? null : buildingArea.trim();
    }

    /**
     * 获取房屋建筑类型
     *
     * @return building_type - 房屋建筑类型
     */
    public String getBuildingType() {
        return buildingType;
    }

    /**
     * 设置房屋建筑类型
     *
     * @param buildingType 房屋建筑类型
     */
    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType == null ? null : buildingType.trim();
    }

    /**
     * 获取房屋建筑用途
     *
     * @return building_use - 房屋建筑用途
     */
    public String getBuildingUse() {
        return buildingUse;
    }

    /**
     * 设置房屋建筑用途
     *
     * @param buildingUse 房屋建筑用途
     */
    public void setBuildingUse(String buildingUse) {
        this.buildingUse = buildingUse == null ? null : buildingUse.trim();
    }

    /**
     * 获取权证号
     *
     * @return warrant_number - 权证号
     */
    public String getWarrantNumber() {
        return warrantNumber;
    }

    /**
     * 设置权证号
     *
     * @param warrantNumber 权证号
     */
    public void setWarrantNumber(String warrantNumber) {
        this.warrantNumber = warrantNumber == null ? null : warrantNumber.trim();
    }

    /**
     * 获取产权人
     *
     * @return ower - 产权人
     */
    public String getOwer() {
        return owner;
    }

    /**
     * 设置产权人
     *
     * @param ower 产权人
     */
    public void setOwer(String ower) {
        this.owner = ower == null ? null : ower.trim();
    }

    /**
     * 获取限制信息
     *
     * @return restriction - 限制信息
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * 设置限制信息
     *
     * @param restriction 限制信息
     */
    public void setRestriction(String restriction) {
        this.restriction = restriction == null ? null : restriction.trim();
    }

    /**
     * 获取使用情况
     *
     * @return use_situation - 使用情况
     */
    public String getUseSituation() {
        return useSituation;
    }

    /**
     * 设置使用情况
     *
     * @param useSituation 使用情况
     */
    public void setUseSituation(String useSituation) {
        this.useSituation = useSituation == null ? null : useSituation.trim();
    }

    /**
     * 获取使用人
     *
     * @return user - 使用人
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置使用人
     *
     * @param user 使用人
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
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
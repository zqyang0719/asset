package com.ces.erp.assetmanagement.biz.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_am_company_summary")
public class CompanySummary {
    /**
     * di
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 企业id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 业企名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 注册资本
     */
    @Column(name = "registered_capital")
    private Double registeredCapital;

    /**
     * 划入企业股权比例
     */
    @Column(name = "share_proportion")
    private String shareProportion;

    /**
     * 按比例投资额
     */
    @Column(name = "investment_amount")
    private Double investmentAmount;

    /**
     * 工商查询股东方股权比例
     */
    @Column(name = "shareholder_equity_ratio")
    private String shareholderEquityRatio;

    /**
     * 原登记股东方情况
     */
    @Column(name = "original_shareholder")
    private String originalShareholder;

    /**
     * 登记工商局
     */
    @Column(name = "register_place")
    private String registerPlace;

    private String remark;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 否是删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 除删人Id
     */
    @Column(name = "delete_user_id")
    private String deleteUserId;

    /**
     * 删除人
     */
    @Column(name = "delete_user")
    private String deleteUser;

    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 获取di
     *
     * @return id - di
     */
    public String getId() {
        return id;
    }

    /**
     * 设置di
     *
     * @param id di
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取企业id
     *
     * @return company_id - 企业id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置企业id
     *
     * @param companyId 企业id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 获取业企名称
     *
     * @return company_name - 业企名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置业企名称
     *
     * @param companyName 业企名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取注册资本
     *
     * @return registered_capital - 注册资本
     */
    public Double getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * 设置注册资本
     *
     * @param registeredCapital 注册资本
     */
    public void setRegisteredCapital(Double registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    /**
     * 获取划入企业股权比例
     *
     * @return share_proportion - 划入企业股权比例
     */
    public String getShareProportion() {
        return shareProportion;
    }

    /**
     * 设置划入企业股权比例
     *
     * @param shareProportion 划入企业股权比例
     */
    public void setShareProportion(String shareProportion) {
        this.shareProportion = shareProportion == null ? null : shareProportion.trim();
    }

    /**
     * 获取按比例投资额
     *
     * @return investment_amount - 按比例投资额
     */
    public Double getInvestmentAmount() {
        return investmentAmount;
    }

    /**
     * 设置按比例投资额
     *
     * @param investmentAmount 按比例投资额
     */
    public void setInvestmentAmount(Double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    /**
     * 获取工商查询股东方股权比例
     *
     * @return shareholder_equity_ratio - 工商查询股东方股权比例
     */
    public String getShareholderEquityRatio() {
        return shareholderEquityRatio;
    }

    /**
     * 设置工商查询股东方股权比例
     *
     * @param shareholderEquityRatio 工商查询股东方股权比例
     */
    public void setShareholderEquityRatio(String shareholderEquityRatio) {
        this.shareholderEquityRatio = shareholderEquityRatio == null ? null : shareholderEquityRatio.trim();
    }

    /**
     * 获取原登记股东方情况
     *
     * @return original_shareholder - 原登记股东方情况
     */
    public String getOriginalShareholder() {
        return originalShareholder;
    }

    /**
     * 设置原登记股东方情况
     *
     * @param originalShareholder 原登记股东方情况
     */
    public void setOriginalShareholder(String originalShareholder) {
        this.originalShareholder = originalShareholder == null ? null : originalShareholder.trim();
    }

    /**
     * 获取登记工商局
     *
     * @return register_place - 登记工商局
     */
    public String getRegisterPlace() {
        return registerPlace;
    }

    /**
     * 设置登记工商局
     *
     * @param registerPlace 登记工商局
     */
    public void setRegisterPlace(String registerPlace) {
        this.registerPlace = registerPlace == null ? null : registerPlace.trim();
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取否是删除
     *
     * @return is_delete - 否是删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置否是删除
     *
     * @param isDelete 否是删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取除删人Id
     *
     * @return delete_user_id - 除删人Id
     */
    public String getDeleteUserId() {
        return deleteUserId;
    }

    /**
     * 设置除删人Id
     *
     * @param deleteUserId 除删人Id
     */
    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    /**
     * 获取删除人
     *
     * @return delete_user - 删除人
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * 设置删除人
     *
     * @param deleteUser 删除人
     */
    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    /**
     * @return delete_time
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * @param deleteTime
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
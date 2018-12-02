package com.ces.erp.assetmanagement.biz.entity;

import javax.persistence.*;

/**
 * 企业投资信息
 */
@Table(name = "t_am_invest_info")
public class InvestInfoEntity {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 被投资企业
     */
    @Column(name = "invested_enterprise")
    private String investedEnterprise;

    /**
     * 注册资本
     */
    @Column(name = "registered_capital")
    private Double registeredCapital;

    /**
     * 状态
     */
    @Column(name = "enterprise_status")
    private String enterpriseStatus;

    /**
     * 性质
     */
    @Column(name = "enterprise_nature")
    private String enterpriseNature;

    /**
     * 投资金额
     */
    @Column(name = "invest_amount")
    private Double investAmount;

    /**
     * 实际出资金额
     */
    @Column(name = "actual_invest_amount")
    private Double actualInvestAmount;

    /**
     * 备注
     */
    private String remark;

    /**
     * company_id
     */
    @Column(name = "company_id")
    private String companyId;

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
     * 获取被投资企业
     *
     * @return invested_enterprise - 被投资企业
     */
    public String getInvestedEnterprise() {
        return investedEnterprise;
    }

    /**
     * 设置被投资企业
     *
     * @param investedEnterprise 被投资企业
     */
    public void setInvestedEnterprise(String investedEnterprise) {
        this.investedEnterprise = investedEnterprise == null ? null : investedEnterprise.trim();
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
     * 获取状态
     *
     * @return enterprise_status - 状态
     */
    public String getEnterpriseStatus() {
        return enterpriseStatus;
    }

    /**
     * 设置状态
     *
     * @param enterpriseStatus 状态
     */
    public void setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus == null ? null : enterpriseStatus.trim();
    }

    /**
     * 获取性质
     *
     * @return enterprise_nature - 性质
     */
    public String getEnterpriseNature() {
        return enterpriseNature;
    }

    /**
     * 设置性质
     *
     * @param enterpriseNature 性质
     */
    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature == null ? null : enterpriseNature.trim();
    }

    /**
     * 获取投资金额
     *
     * @return invest_amount - 投资金额
     */
    public Double getInvestAmount() {
        return investAmount;
    }

    /**
     * 设置投资金额
     *
     * @param investAmount 投资金额
     */
    public void setInvestAmount(Double investAmount) {
        this.investAmount = investAmount;
    }

    /**
     * 获取实际出资金额
     *
     * @return actual_invest_amount - 实际出资金额
     */
    public Double getActualInvestAmount() {
        return actualInvestAmount;
    }

    /**
     * 设置实际出资金额
     *
     * @param actualInvestAmount 实际出资金额
     */
    public void setActualInvestAmount(Double actualInvestAmount) {
        this.actualInvestAmount = actualInvestAmount;
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
}
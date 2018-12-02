package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 企业股东信息
 */
@Table(name = "t_am_shareholder")
public class ShareholderEntity extends BaseEntity{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 认缴金额
     */
    @Column(name = "subscription_amount")
    private Double subscriptionAmount;

    /**
     * 实缴金额
     */
    @Column(name = "paid_amount")
    private Double paidAmount;

    /**
     * 认缴比例
     */
    @Column(name = "subscription_radio")
    private Double subscriptionRadio;

    /**
     * 隶属公司
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 投资方
     */
    private byte[] investor;

    /**
     * 隶属公司名称
     */
    @Column(name = "company_name")
    private byte[] companyName;

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
     * 获取认缴金额
     *
     * @return subscription_amount - 认缴金额
     */
    public Double getSubscriptionAmount() {
        return subscriptionAmount;
    }

    /**
     * 设置认缴金额
     *
     * @param subscriptionAmount 认缴金额
     */
    public void setSubscriptionAmount(Double subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }

    /**
     * 获取实缴金额
     *
     * @return paid_amount - 实缴金额
     */
    public Double getPaidAmount() {
        return paidAmount;
    }

    /**
     * 设置实缴金额
     *
     * @param paidAmount 实缴金额
     */
    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 获取认缴比例
     *
     * @return subscription_radio - 认缴比例
     */
    public Double getSubscriptionRadio() {
        return subscriptionRadio;
    }

    /**
     * 设置认缴比例
     *
     * @param subscriptionRadio 认缴比例
     */
    public void setSubscriptionRadio(Double subscriptionRadio) {
        this.subscriptionRadio = subscriptionRadio;
    }

    /**
     * 获取隶属公司
     *
     * @return company_id - 隶属公司
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置隶属公司
     *
     * @param companyId 隶属公司
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 获取投资方
     *
     * @return investor - 投资方
     */
    public byte[] getInvestor() {
        return investor;
    }

    /**
     * 设置投资方
     *
     * @param investor 投资方
     */
    public void setInvestor(byte[] investor) {
        this.investor = investor;
    }

    /**
     * 获取隶属公司名称
     *
     * @return company_name - 隶属公司名称
     */
    public byte[] getCompanyName() {
        return companyName;
    }

    /**
     * 设置隶属公司名称
     *
     * @param companyName 隶属公司名称
     */
    public void setCompanyName(byte[] companyName) {
        this.companyName = companyName;
    }
}
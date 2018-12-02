package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 抵押情况实体类
 */
@Table(name = "t_am_mortgage")
public class MortgageEntity extends BaseEntity{
    /**
     * mortgage_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 抵押人
     */
    private String mortgagor;

    /**
     * 债权人
     */
    private String creditor;

    /**
     * 抵押事由
     */
    @Column(name = "mortgage_reason")
    private String mortgageReason;

    /**
     * 抵押物原值
     */
    @Column(name = "original_amount")
    private Double originalAmount;

    /**
     * 抵押金额
     */
    @Column(name = "mortgage_amount")
    private Double mortgageAmount;

    /**
     * 抵押时间
     */
    @Column(name = "mortgage_date")
    private String mortgageDate;

    /**
     * 隶属公司
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 获取mortgage_id
     *
     * @return id - mortgage_id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置mortgage_id
     *
     * @param id mortgage_id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取抵押人
     *
     * @return mortgagor - 抵押人
     */
    public String getMortgagor() {
        return mortgagor;
    }

    /**
     * 设置抵押人
     *
     * @param mortgagor 抵押人
     */
    public void setMortgagor(String mortgagor) {
        this.mortgagor = mortgagor == null ? null : mortgagor.trim();
    }

    /**
     * 获取债权人
     *
     * @return creditor - 债权人
     */
    public String getCreditor() {
        return creditor;
    }

    /**
     * 设置债权人
     *
     * @param creditor 债权人
     */
    public void setCreditor(String creditor) {
        this.creditor = creditor == null ? null : creditor.trim();
    }

    /**
     * 获取抵押事由
     *
     * @return mortgage_reason - 抵押事由
     */
    public String getMortgageReason() {
        return mortgageReason;
    }

    /**
     * 设置抵押事由
     *
     * @param mortgageReason 抵押事由
     */
    public void setMortgageReason(String mortgageReason) {
        this.mortgageReason = mortgageReason == null ? null : mortgageReason.trim();
    }

    /**
     * 获取抵押物原值
     *
     * @return original_amount - 抵押物原值
     */
    public Double getOriginalAmount() {
        return originalAmount;
    }

    /**
     * 设置抵押物原值
     *
     * @param originalAmount 抵押物原值
     */
    public void setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * 获取抵押金额
     *
     * @return mortgage_amount - 抵押金额
     */
    public Double getMortgageAmount() {
        return mortgageAmount;
    }

    /**
     * 设置抵押金额
     *
     * @param mortgageAmount 抵押金额
     */
    public void setMortgageAmount(Double mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }

    /**
     * 获取抵押时间
     *
     * @return mortgage_date - 抵押时间
     */
    public String getMortgageDate() {
        return mortgageDate;
    }

    /**
     * 设置抵押时间
     *
     * @param mortgageDate 抵押时间
     */
    public void setMortgageDate(String mortgageDate) {
        this.mortgageDate = mortgageDate == null ? null : mortgageDate.trim();
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
}
package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import java.util.Date;
import javax.persistence.*;

/**
 * 对外担保信息
 */
@Table(name = "t_am_foreign_guarantee")
public class ForeignGuaranteeEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * company_id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 被担保单位名称
     */
    @Column(name = "guaranteed_enterprise")
    private String guaranteedEnterprise;

    /**
     * 金融机构名称
     */
    @Column(name = "financial_institution")
    private String financialInstitution;

    /**
     * 担保金额
     */
    @Column(name = "guarantee_amount")
    private Double guaranteeAmount;

    /**
     * 担保起讫时间
     */
    @Column(name = "start_end")
    private String startEnd;

    /**
     * 担保内容
     */
    @Column(name = "guarantee_content")
    private String guaranteeContent;

    /**
     * 担保形式
     */
    @Column(name = "guarantee_form")
    private String guaranteeForm;

    /**
     * 是否为关联担保
     */
    @Column(name = "is_related_guarantee")
    private String isRelatedGuarantee;

    /**
     * 备注
     */
    private String remark;


    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
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
     * 获取被担保单位名称
     *
     * @return guaranteed_enterprise - 被担保单位名称
     */
    public String getGuaranteedEnterprise() {
        return guaranteedEnterprise;
    }

    /**
     * 设置被担保单位名称
     *
     * @param guaranteedEnterprise 被担保单位名称
     */
    public void setGuaranteedEnterprise(String guaranteedEnterprise) {
        this.guaranteedEnterprise = guaranteedEnterprise == null ? null : guaranteedEnterprise.trim();
    }

    /**
     * 获取金融机构名称
     *
     * @return financial_institution - 金融机构名称
     */
    public String getFinancialInstitution() {
        return financialInstitution;
    }

    /**
     * 设置金融机构名称
     *
     * @param financialInstitution 金融机构名称
     */
    public void setFinancialInstitution(String financialInstitution) {
        this.financialInstitution = financialInstitution == null ? null : financialInstitution.trim();
    }

    /**
     * 获取担保金额
     *
     * @return guarantee_amount - 担保金额
     */
    public Double getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * 设置担保金额
     *
     * @param guaranteeAmount 担保金额
     */
    public void setGuaranteeAmount(Double guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    /**
     * 获取担保起讫时间
     *
     * @return start_end - 担保起讫时间
     */
    public String getStartEnd() {
        return startEnd;
    }

    /**
     * 设置担保起讫时间
     *
     * @param startEnd 担保起讫时间
     */
    public void setStartEnd(String startEnd) {
        this.startEnd = startEnd == null ? null : startEnd.trim();
    }

    /**
     * 获取担保内容
     *
     * @return guarantee_content - 担保内容
     */
    public String getGuaranteeContent() {
        return guaranteeContent;
    }

    /**
     * 设置担保内容
     *
     * @param guaranteeContent 担保内容
     */
    public void setGuaranteeContent(String guaranteeContent) {
        this.guaranteeContent = guaranteeContent == null ? null : guaranteeContent.trim();
    }

    /**
     * 获取担保形式
     *
     * @return guarantee_form - 担保形式
     */
    public String getGuaranteeForm() {
        return guaranteeForm;
    }

    /**
     * 设置担保形式
     *
     * @param guaranteeForm 担保形式
     */
    public void setGuaranteeForm(String guaranteeForm) {
        this.guaranteeForm = guaranteeForm == null ? null : guaranteeForm.trim();
    }

    /**
     * 获取是否为关联担保
     *
     * @return is_related_guarantee - 是否为关联担保
     */
    public String getIsRelatedGuarantee() {
        return isRelatedGuarantee;
    }

    /**
     * 设置是否为关联担保
     *
     * @param isRelatedGuarantee 是否为关联担保
     */
    public void setIsRelatedGuarantee(String isRelatedGuarantee) {
        this.isRelatedGuarantee = isRelatedGuarantee == null ? null : isRelatedGuarantee.trim();
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
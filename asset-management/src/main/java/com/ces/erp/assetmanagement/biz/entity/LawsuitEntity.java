package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 诉讼实体类
 */
@Table(name = "t_am_lawsuit")
public class LawsuitEntity extends BaseEntity{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 债权人名称
     */
    private String debtor;

    /**
     * 诉讼内容
     */
    @Column(name = "lawsuit_content")
    private String lawsuitContent;

    /**
     * 标的金额
     */
    @Column(name = "subject_amount")
    private Double subjectAmount;

    /**
     * 诉讼日期
     */
    @Column(name = "lawsuit_date")
    private String lawsuitDate;

    /**
     * 受理法院
     */
    @Column(name = "accepted_court")
    private String acceptedCourt;

    /**
     * 执行情况
     */
    private String execution;

    /**
     * 隶属公司
     */
    @Column(name = "company_id")
    private Integer companyId;

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
     * 获取债权人名称
     *
     * @return debtor - 债权人名称
     */
    public String getDebtor() {
        return debtor;
    }

    /**
     * 设置债权人名称
     *
     * @param debtor 债权人名称
     */
    public void setDebtor(String debtor) {
        this.debtor = debtor == null ? null : debtor.trim();
    }

    /**
     * 获取诉讼内容
     *
     * @return lawsuit_content - 诉讼内容
     */
    public String getLawsuitContent() {
        return lawsuitContent;
    }

    /**
     * 设置诉讼内容
     *
     * @param lawsuitContent 诉讼内容
     */
    public void setLawsuitContent(String lawsuitContent) {
        this.lawsuitContent = lawsuitContent == null ? null : lawsuitContent.trim();
    }

    /**
     * 获取标的金额
     *
     * @return subject_amount - 标的金额
     */
    public Double getSubjectAmount() {
        return subjectAmount;
    }

    /**
     * 设置标的金额
     *
     * @param subjectAmount 标的金额
     */
    public void setSubjectAmount(Double subjectAmount) {
        this.subjectAmount = subjectAmount;
    }

    /**
     * 获取诉讼日期
     *
     * @return lawsuit_date - 诉讼日期
     */
    public String getLawsuitDate() {
        return lawsuitDate;
    }

    /**
     * 设置诉讼日期
     *
     * @param lawsuitDate 诉讼日期
     */
    public void setLawsuitDate(String lawsuitDate) {
        this.lawsuitDate = lawsuitDate == null ? null : lawsuitDate.trim();
    }

    /**
     * 获取受理法院
     *
     * @return accepted_court - 受理法院
     */
    public String getAcceptedCourt() {
        return acceptedCourt;
    }

    /**
     * 设置受理法院
     *
     * @param acceptedCourt 受理法院
     */
    public void setAcceptedCourt(String acceptedCourt) {
        this.acceptedCourt = acceptedCourt == null ? null : acceptedCourt.trim();
    }

    /**
     * 获取执行情况
     *
     * @return execution - 执行情况
     */
    public String getExecution() {
        return execution;
    }

    /**
     * 设置执行情况
     *
     * @param execution 执行情况
     */
    public void setExecution(String execution) {
        this.execution = execution == null ? null : execution.trim();
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
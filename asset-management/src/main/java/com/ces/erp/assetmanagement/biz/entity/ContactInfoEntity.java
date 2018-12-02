package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 企业联系方式
 */
@Table(name = "t_am_contact_info")
public class ContactInfoEntity extends BaseEntity{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 隶属公司
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 企业负责人姓名
     */
    @Column(name = "enterprise_name")
    private String enterpriseName;

    /**
     * 企业负责人职务
     */
    @Column(name = "enterprise_post")
    private String enterprisePost;

    /**
     * 企业负责人固定电话
     */
    @Column(name = "enterprise_tel")
    private String enterpriseTel;

    /**
     * 企业负责人手机
     */
    @Column(name = "enterprise_mobile")
    private String enterpriseMobile;

    /**
     * 企业党组织负责人
     */
    @Column(name = "party_name")
    private String partyName;

    /**
     * 党组织负责人职务
     */
    @Column(name = "party_post")
    private String partyPost;

    /**
     * 党组织负责人固定电话
     */
    @Column(name = "party_tel")
    private String partyTel;

    /**
     * 党组织负责人手机
     */
    @Column(name = "party_mobile")
    private String partyMobile;

    /**
     * 办公室联系人姓名
     */
    @Column(name = "office_name")
    private String officeName;

    /**
     * 办公室联系人职务
     */
    @Column(name = "office_post")
    private String officePost;

    /**
     * 办公室联系人固定电话
     */
    @Column(name = "office_tel")
    private String officeTel;

    /**
     * 办公室联系人手机
     */
    @Column(name = "office_mobile")
    private String officeMobile;

    /**
     * 财务联系人姓名
     */
    @Column(name = "finance_name")
    private String financeName;

    /**
     * 财务联系人职务
     */
    @Column(name = "finance_post")
    private String financePost;

    /**
     * 财务联系人固定电话
     */
    @Column(name = "finance_tel")
    private String financeTel;

    /**
     * 财务联系人手机
     */
    @Column(name = "finance_mobile")
    private String financeMobile;

    /**
     * 人力资源联系人姓名
     */
    @Column(name = "hr_name")
    private String hrName;

    /**
     * 人力资源联系人职务
     */
    @Column(name = "hr_post")
    private String hrPost;

    /**
     * 人力资源联系人固定电话
     */
    @Column(name = "hr_tel")
    private String hrTel;

    /**
     * 人力资源联系人手机
     */
    @Column(name = "hr_mobile")
    private String hrMobile;

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
     * 获取企业负责人姓名
     *
     * @return enterprise_name - 企业负责人姓名
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * 设置企业负责人姓名
     *
     * @param enterpriseName 企业负责人姓名
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    /**
     * 获取企业负责人职务
     *
     * @return enterprise_post - 企业负责人职务
     */
    public String getEnterprisePost() {
        return enterprisePost;
    }

    /**
     * 设置企业负责人职务
     *
     * @param enterprisePost 企业负责人职务
     */
    public void setEnterprisePost(String enterprisePost) {
        this.enterprisePost = enterprisePost == null ? null : enterprisePost.trim();
    }

    /**
     * 获取企业负责人固定电话
     *
     * @return enterprise_tel - 企业负责人固定电话
     */
    public String getEnterpriseTel() {
        return enterpriseTel;
    }

    /**
     * 设置企业负责人固定电话
     *
     * @param enterpriseTel 企业负责人固定电话
     */
    public void setEnterpriseTel(String enterpriseTel) {
        this.enterpriseTel = enterpriseTel == null ? null : enterpriseTel.trim();
    }

    /**
     * 获取企业负责人手机
     *
     * @return enterprise_mobile - 企业负责人手机
     */
    public String getEnterpriseMobile() {
        return enterpriseMobile;
    }

    /**
     * 设置企业负责人手机
     *
     * @param enterpriseMobile 企业负责人手机
     */
    public void setEnterpriseMobile(String enterpriseMobile) {
        this.enterpriseMobile = enterpriseMobile == null ? null : enterpriseMobile.trim();
    }

    /**
     * 获取企业党组织负责人
     *
     * @return party_name - 企业党组织负责人
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * 设置企业党组织负责人
     *
     * @param partyName 企业党组织负责人
     */
    public void setPartyName(String partyName) {
        this.partyName = partyName == null ? null : partyName.trim();
    }

    /**
     * 获取党组织负责人职务
     *
     * @return party_post - 党组织负责人职务
     */
    public String getPartyPost() {
        return partyPost;
    }

    /**
     * 设置党组织负责人职务
     *
     * @param partyPost 党组织负责人职务
     */
    public void setPartyPost(String partyPost) {
        this.partyPost = partyPost == null ? null : partyPost.trim();
    }

    /**
     * 获取党组织负责人固定电话
     *
     * @return party_tel - 党组织负责人固定电话
     */
    public String getPartyTel() {
        return partyTel;
    }

    /**
     * 设置党组织负责人固定电话
     *
     * @param partyTel 党组织负责人固定电话
     */
    public void setPartyTel(String partyTel) {
        this.partyTel = partyTel == null ? null : partyTel.trim();
    }

    /**
     * 获取党组织负责人手机
     *
     * @return party_mobile - 党组织负责人手机
     */
    public String getPartyMobile() {
        return partyMobile;
    }

    /**
     * 设置党组织负责人手机
     *
     * @param partyMobile 党组织负责人手机
     */
    public void setPartyMobile(String partyMobile) {
        this.partyMobile = partyMobile == null ? null : partyMobile.trim();
    }

    /**
     * 获取办公室联系人姓名
     *
     * @return office_name - 办公室联系人姓名
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * 设置办公室联系人姓名
     *
     * @param officeName 办公室联系人姓名
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName == null ? null : officeName.trim();
    }

    /**
     * 获取办公室联系人职务
     *
     * @return office_post - 办公室联系人职务
     */
    public String getOfficePost() {
        return officePost;
    }

    /**
     * 设置办公室联系人职务
     *
     * @param officePost 办公室联系人职务
     */
    public void setOfficePost(String officePost) {
        this.officePost = officePost == null ? null : officePost.trim();
    }

    /**
     * 获取办公室联系人固定电话
     *
     * @return office_tel - 办公室联系人固定电话
     */
    public String getOfficeTel() {
        return officeTel;
    }

    /**
     * 设置办公室联系人固定电话
     *
     * @param officeTel 办公室联系人固定电话
     */
    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel == null ? null : officeTel.trim();
    }

    /**
     * 获取办公室联系人手机
     *
     * @return office_mobile - 办公室联系人手机
     */
    public String getOfficeMobile() {
        return officeMobile;
    }

    /**
     * 设置办公室联系人手机
     *
     * @param officeMobile 办公室联系人手机
     */
    public void setOfficeMobile(String officeMobile) {
        this.officeMobile = officeMobile == null ? null : officeMobile.trim();
    }

    /**
     * 获取财务联系人姓名
     *
     * @return finance_name - 财务联系人姓名
     */
    public String getFinanceName() {
        return financeName;
    }

    /**
     * 设置财务联系人姓名
     *
     * @param financeName 财务联系人姓名
     */
    public void setFinanceName(String financeName) {
        this.financeName = financeName == null ? null : financeName.trim();
    }

    /**
     * 获取财务联系人职务
     *
     * @return finance_post - 财务联系人职务
     */
    public String getFinancePost() {
        return financePost;
    }

    /**
     * 设置财务联系人职务
     *
     * @param financePost 财务联系人职务
     */
    public void setFinancePost(String financePost) {
        this.financePost = financePost == null ? null : financePost.trim();
    }

    /**
     * 获取财务联系人固定电话
     *
     * @return finance_tel - 财务联系人固定电话
     */
    public String getFinanceTel() {
        return financeTel;
    }

    /**
     * 设置财务联系人固定电话
     *
     * @param financeTel 财务联系人固定电话
     */
    public void setFinanceTel(String financeTel) {
        this.financeTel = financeTel == null ? null : financeTel.trim();
    }

    /**
     * 获取财务联系人手机
     *
     * @return finance_mobile - 财务联系人手机
     */
    public String getFinanceMobile() {
        return financeMobile;
    }

    /**
     * 设置财务联系人手机
     *
     * @param financeMobile 财务联系人手机
     */
    public void setFinanceMobile(String financeMobile) {
        this.financeMobile = financeMobile == null ? null : financeMobile.trim();
    }

    /**
     * 获取人力资源联系人姓名
     *
     * @return hr_name - 人力资源联系人姓名
     */
    public String getHrName() {
        return hrName;
    }

    /**
     * 设置人力资源联系人姓名
     *
     * @param hrName 人力资源联系人姓名
     */
    public void setHrName(String hrName) {
        this.hrName = hrName == null ? null : hrName.trim();
    }

    /**
     * 获取人力资源联系人职务
     *
     * @return hr_post - 人力资源联系人职务
     */
    public String getHrPost() {
        return hrPost;
    }

    /**
     * 设置人力资源联系人职务
     *
     * @param hrPost 人力资源联系人职务
     */
    public void setHrPost(String hrPost) {
        this.hrPost = hrPost == null ? null : hrPost.trim();
    }

    /**
     * 获取人力资源联系人固定电话
     *
     * @return hr_tel - 人力资源联系人固定电话
     */
    public String getHrTel() {
        return hrTel;
    }

    /**
     * 设置人力资源联系人固定电话
     *
     * @param hrTel 人力资源联系人固定电话
     */
    public void setHrTel(String hrTel) {
        this.hrTel = hrTel == null ? null : hrTel.trim();
    }

    /**
     * 获取人力资源联系人手机
     *
     * @return hr_mobile - 人力资源联系人手机
     */
    public String getHrMobile() {
        return hrMobile;
    }

    /**
     * 设置人力资源联系人手机
     *
     * @param hrMobile 人力资源联系人手机
     */
    public void setHrMobile(String hrMobile) {
        this.hrMobile = hrMobile == null ? null : hrMobile.trim();
    }
}
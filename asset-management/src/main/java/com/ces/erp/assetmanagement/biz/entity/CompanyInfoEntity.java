package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 企业基本信息实体类
 */
@Table(name = "t_am_companyinfo")
public class CompanyInfoEntity extends BaseEntity{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 成立日期
     */
    @Column(name = "found_date")
    private String foundDate;

    /**
     * 营业期限
     */
    @Column(name = "business_term")
    private String businessTerm;

    /**
     * 社会统一信用号
     */
    @Column(name = "credit_number")
    private String creditNumber;

    /**
     * 注册资本
     */
    @Column(name = "registered_capital")
    private Double registeredCapital;

    /**
     * 注册地址
     */
    @Column(name = "register_address")
    private String registerAddress;

    /**
     * 登记机关
     */
    @Column(name = "registration_authority")
    private String registrationAuthority;

    /**
     * 法定代表人
     */
    @Column(name = "legal_person")
    private String legalPerson;

    /**
     * 董事
     */
    private String director;

    /**
     * 董事id
     */
    @Column(name = "director_id")
    private String directorId;

    /**
     * 监事
     */
    private String supervisor;

    /**
     * 监事id
     */
    @Column(name = "supervisor_id")
    private String supervisorId;

    /**
     * 总经理
     */
    private String manager;

    /**
     * 总经理id
     */
    @Column(name = "manager_id")
    private String managerId;

    /**
     * 公司类型
     */
    @Column(name = "company_type")
    private String companyType;

    /**
     * 经营范围
     */
    @Column(name = "business_scope")
    private String businessScope;

    /**
     * 公司网址
     */
    private String website;

    /**
     * 实际经营业务情况
     */
    @Column(name = "business_status")
    private String businessStatus;

    /**
     * 企业现状
     */
    @Column(name = "company_state")
    private String companyState;

    /**
     * 资产关系
     */
    private String relation;

    /**
     * 比例
     */
    private Double ratio;

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
     * 获取成立日期
     *
     * @return found_date - 成立日期
     */
    public String getFoundDate() {
        return foundDate;
    }

    /**
     * 设置成立日期
     *
     * @param foundDate 成立日期
     */
    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate == null ? null : foundDate.trim();
    }

    /**
     * 获取营业期限
     *
     * @return business_term - 营业期限
     */
    public String getBusinessTerm() {
        return businessTerm;
    }

    /**
     * 设置营业期限
     *
     * @param businessTerm 营业期限
     */
    public void setBusinessTerm(String businessTerm) {
        this.businessTerm = businessTerm == null ? null : businessTerm.trim();
    }

    /**
     * 获取社会统一信用号
     *
     * @return credit_number - 社会统一信用号
     */
    public String getCreditNumber() {
        return creditNumber;
    }

    /**
     * 设置社会统一信用号
     *
     * @param creditNumber 社会统一信用号
     */
    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber == null ? null : creditNumber.trim();
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
     * 获取注册地址
     *
     * @return register_address - 注册地址
     */
    public String getRegisterAddress() {
        return registerAddress;
    }

    /**
     * 设置注册地址
     *
     * @param registerAddress 注册地址
     */
    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    /**
     * 获取登记机关
     *
     * @return registration_authority - 登记机关
     */
    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    /**
     * 设置登记机关
     *
     * @param registrationAuthority 登记机关
     */
    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority == null ? null : registrationAuthority.trim();
    }

    /**
     * 获取法定代表人
     *
     * @return legal_person - 法定代表人
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * 设置法定代表人
     *
     * @param legalPerson 法定代表人
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    /**
     * 获取董事
     *
     * @return director - 董事
     */
    public String getDirector() {
        return director;
    }

    /**
     * 设置董事
     *
     * @param director 董事
     */
    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    /**
     * 获取董事id
     *
     * @return director_id - 董事id
     */
    public String getDirectorId() {
        return directorId;
    }

    /**
     * 设置董事id
     *
     * @param directorId 董事id
     */
    public void setDirectorId(String directorId) {
        this.directorId = directorId == null ? null : directorId.trim();
    }

    /**
     * 获取监事
     *
     * @return supervisor - 监事
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * 设置监事
     *
     * @param supervisor 监事
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    /**
     * 获取监事id
     *
     * @return supervisor_id - 监事id
     */
    public String getSupervisorId() {
        return supervisorId;
    }

    /**
     * 设置监事id
     *
     * @param supervisorId 监事id
     */
    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId == null ? null : supervisorId.trim();
    }

    /**
     * 获取总经理
     *
     * @return manager - 总经理
     */
    public String getManager() {
        return manager;
    }

    /**
     * 设置总经理
     *
     * @param manager 总经理
     */
    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    /**
     * 获取总经理id
     *
     * @return manager_id - 总经理id
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * 设置总经理id
     *
     * @param managerId 总经理id
     */
    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    /**
     * 获取公司类型
     *
     * @return company_type - 公司类型
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 设置公司类型
     *
     * @param companyType 公司类型
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * 获取经营范围
     *
     * @return business_scope - 经营范围
     */
    public String getBusinessScope() {
        return businessScope;
    }

    /**
     * 设置经营范围
     *
     * @param businessScope 经营范围
     */
    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    /**
     * 获取公司网址
     *
     * @return website - 公司网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置公司网址
     *
     * @param website 公司网址
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    /**
     * 获取实际经营业务情况
     *
     * @return business_status - 实际经营业务情况
     */
    public String getBusinessStatus() {
        return businessStatus;
    }

    /**
     * 设置实际经营业务情况
     *
     * @param businessStatus 实际经营业务情况
     */
    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus == null ? null : businessStatus.trim();
    }

    /**
     * 获取企业现状
     *
     * @return company_state - 企业现状
     */
    public String getCompanyState() {
        return companyState;
    }

    /**
     * 设置企业现状
     *
     * @param companyState 企业现状
     */
    public void setCompanyState(String companyState) {
        this.companyState = companyState == null ? null : companyState.trim();
    }

    /**
     * 获取资产关系
     *
     * @return relation - 资产关系
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 设置资产关系
     *
     * @param relation 资产关系
     */
    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    /**
     * 获取比例
     *
     * @return ratio - 比例
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * 设置比例
     *
     * @param ratio 比例
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}
package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 信息化建设信息
 */
@Table(name = "t_am_info_construction")
public class InfoConstructionEntity extends BaseEntity{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 企业门户网站
     */
    private String website;

    /**
     * 面向社会开发
     */
    private String outsocial;

    /**
     * 委外服务
     */
    @Column(name = "web_outsource")
    private String webOutsource;

    /**
     * 微信公众号
     */
    private String weixin;

    /**
     * 微信委外服务
     */
    @Column(name = "wx_outsource")
    private String wxOutsource;

    /**
     * 企业邮箱
     */
    private String mailbox;

    /**
     * 邮箱委外服务
     */
    @Column(name = "mail_outsource")
    private String mailOutsource;

    /**
     * 企业(付费)域名
     */
    @Column(name = "domain_name")
    private String domainName;

    /**
     * 域名委外服务
     */
    @Column(name = "domain_outsource")
    private String domainOutsource;

    /**
     * 数据库服务器
     */
    @Column(name = "database_server")
    private String databaseServer;

    /**
     * 数据库服务器委外服务
     */
    @Column(name = "database_outsource")
    private String databaseOutsource;

    /**
     * 信息化业务达标(合规性)整改
     */
    private String reform;

    /**
     * 被政府相关部门要求
     */
    @Column(name = "gov_required")
    private String govRequired;

    /**
     * 被社会组织要求
     */
    @Column(name = "social_required")
    private String socialRequired;

    /**
     * 信息化业务法律纠纷
     */
    @Column(name = "legal_dispute")
    private String legalDispute;

    /**
     * 与社会企业组织相关的利益诉求
     */
    @Column(name = "org_dispute")
    private String orgDispute;

    /**
     * 与其他企业之间的利益诉求
     */
    @Column(name = "business_dispute")
    private String businessDispute;

    /**
     * 隶属公司
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
     * 获取企业门户网站
     *
     * @return website - 企业门户网站
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置企业门户网站
     *
     * @param website 企业门户网站
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    /**
     * 获取面向社会开发
     *
     * @return outsocial - 面向社会开发
     */
    public String getOutsocial() {
        return outsocial;
    }

    /**
     * 设置面向社会开发
     *
     * @param outsocial 面向社会开发
     */
    public void setOutsocial(String outsocial) {
        this.outsocial = outsocial == null ? null : outsocial.trim();
    }

    /**
     * 获取委外服务
     *
     * @return web_outsource - 委外服务
     */
    public String getWebOutsource() {
        return webOutsource;
    }

    /**
     * 设置委外服务
     *
     * @param webOutsource 委外服务
     */
    public void setWebOutsource(String webOutsource) {
        this.webOutsource = webOutsource == null ? null : webOutsource.trim();
    }

    /**
     * 获取微信公众号
     *
     * @return weixin - 微信公众号
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置微信公众号
     *
     * @param weixin 微信公众号
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    /**
     * 获取微信委外服务
     *
     * @return wx_outsource - 微信委外服务
     */
    public String getWxOutsource() {
        return wxOutsource;
    }

    /**
     * 设置微信委外服务
     *
     * @param wxOutsource 微信委外服务
     */
    public void setWxOutsource(String wxOutsource) {
        this.wxOutsource = wxOutsource == null ? null : wxOutsource.trim();
    }

    /**
     * 获取企业邮箱
     *
     * @return mailbox - 企业邮箱
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * 设置企业邮箱
     *
     * @param mailbox 企业邮箱
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox == null ? null : mailbox.trim();
    }

    /**
     * 获取邮箱委外服务
     *
     * @return mail_outsource - 邮箱委外服务
     */
    public String getMailOutsource() {
        return mailOutsource;
    }

    /**
     * 设置邮箱委外服务
     *
     * @param mailOutsource 邮箱委外服务
     */
    public void setMailOutsource(String mailOutsource) {
        this.mailOutsource = mailOutsource == null ? null : mailOutsource.trim();
    }

    /**
     * 获取企业(付费)域名
     *
     * @return domain_name - 企业(付费)域名
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * 设置企业(付费)域名
     *
     * @param domainName 企业(付费)域名
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    /**
     * 获取域名委外服务
     *
     * @return domain_outsource - 域名委外服务
     */
    public String getDomainOutsource() {
        return domainOutsource;
    }

    /**
     * 设置域名委外服务
     *
     * @param domainOutsource 域名委外服务
     */
    public void setDomainOutsource(String domainOutsource) {
        this.domainOutsource = domainOutsource == null ? null : domainOutsource.trim();
    }

    /**
     * 获取数据库服务器
     *
     * @return database_server - 数据库服务器
     */
    public String getDatabaseServer() {
        return databaseServer;
    }

    /**
     * 设置数据库服务器
     *
     * @param databaseServer 数据库服务器
     */
    public void setDatabaseServer(String databaseServer) {
        this.databaseServer = databaseServer == null ? null : databaseServer.trim();
    }

    /**
     * 获取数据库服务器委外服务
     *
     * @return database_outsource - 数据库服务器委外服务
     */
    public String getDatabaseOutsource() {
        return databaseOutsource;
    }

    /**
     * 设置数据库服务器委外服务
     *
     * @param databaseOutsource 数据库服务器委外服务
     */
    public void setDatabaseOutsource(String databaseOutsource) {
        this.databaseOutsource = databaseOutsource == null ? null : databaseOutsource.trim();
    }

    /**
     * 获取信息化业务达标(合规性)整改
     *
     * @return reform - 信息化业务达标(合规性)整改
     */
    public String getReform() {
        return reform;
    }

    /**
     * 设置信息化业务达标(合规性)整改
     *
     * @param reform 信息化业务达标(合规性)整改
     */
    public void setReform(String reform) {
        this.reform = reform == null ? null : reform.trim();
    }

    /**
     * 获取被政府相关部门要求
     *
     * @return gov_required - 被政府相关部门要求
     */
    public String getGovRequired() {
        return govRequired;
    }

    /**
     * 设置被政府相关部门要求
     *
     * @param govRequired 被政府相关部门要求
     */
    public void setGovRequired(String govRequired) {
        this.govRequired = govRequired == null ? null : govRequired.trim();
    }

    /**
     * 获取被社会组织要求
     *
     * @return social_required - 被社会组织要求
     */
    public String getSocialRequired() {
        return socialRequired;
    }

    /**
     * 设置被社会组织要求
     *
     * @param socialRequired 被社会组织要求
     */
    public void setSocialRequired(String socialRequired) {
        this.socialRequired = socialRequired == null ? null : socialRequired.trim();
    }

    /**
     * 获取信息化业务法律纠纷
     *
     * @return legal_dispute - 信息化业务法律纠纷
     */
    public String getLegalDispute() {
        return legalDispute;
    }

    /**
     * 设置信息化业务法律纠纷
     *
     * @param legalDispute 信息化业务法律纠纷
     */
    public void setLegalDispute(String legalDispute) {
        this.legalDispute = legalDispute == null ? null : legalDispute.trim();
    }

    /**
     * 获取与社会企业组织相关的利益诉求
     *
     * @return org_dispute - 与社会企业组织相关的利益诉求
     */
    public String getOrgDispute() {
        return orgDispute;
    }

    /**
     * 设置与社会企业组织相关的利益诉求
     *
     * @param orgDispute 与社会企业组织相关的利益诉求
     */
    public void setOrgDispute(String orgDispute) {
        this.orgDispute = orgDispute == null ? null : orgDispute.trim();
    }

    /**
     * 获取与其他企业之间的利益诉求
     *
     * @return business_dispute - 与其他企业之间的利益诉求
     */
    public String getBusinessDispute() {
        return businessDispute;
    }

    /**
     * 设置与其他企业之间的利益诉求
     *
     * @param businessDispute 与其他企业之间的利益诉求
     */
    public void setBusinessDispute(String businessDispute) {
        this.businessDispute = businessDispute == null ? null : businessDispute.trim();
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
}
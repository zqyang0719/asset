package com.ces.erp.assetmanagement.biz.entity;

import javax.persistence.*;

/**
 * 企业股东变更信息
 */
@Table(name = "t_am_sharehold_change")
public class ShareholdChangeEntity {
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
     * change_content
     */
    @Column(name = "change_content")
    private String changeContent;

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
     * 获取change_content
     *
     * @return change_content - change_content
     */
    public String getChangeContent() {
        return changeContent;
    }

    /**
     * 设置change_content
     *
     * @param changeContent change_content
     */
    public void setChangeContent(String changeContent) {
        this.changeContent = changeContent == null ? null : changeContent.trim();
    }
}
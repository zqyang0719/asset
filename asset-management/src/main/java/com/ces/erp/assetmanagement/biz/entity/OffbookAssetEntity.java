package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import java.util.Date;
import javax.persistence.*;

/**
 * 账外资产信息
 */
@Table(name = "t_am_offbook_asset")
public class OffbookAssetEntity extends BaseEntity{
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
     * if_has
     */
    @Column(name = "if_has")
    private String ifHas;

    /**
     * content
     */
    private String content;


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
     * 获取if_has
     *
     * @return if_has - if_has
     */
    public String getIfHas() {
        return ifHas;
    }

    /**
     * 设置if_has
     *
     * @param ifHas if_has
     */
    public void setIfHas(String ifHas) {
        this.ifHas = ifHas == null ? null : ifHas.trim();
    }

    /**
     * 获取content
     *
     * @return content - content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

}
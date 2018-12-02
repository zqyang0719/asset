package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import java.util.Date;
import javax.persistence.*;

/**
 * 党组织信息
 */
@Table(name = "t_am_party_info")
public class PartyInfoEntity extends BaseEntity{
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
     * 党组织名称
     */
    @Column(name = "party_name")
    private String partyName;

    /**
     * 建制
     */
    @Column(name = "org_system")
    private String orgSystem;

    /**
     * 党员人数
     */
    @Column(name = "member_amount")
    private String memberAmount;

    /**
     * 备注
     */
    private String remark;


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
     * 获取党组织名称
     *
     * @return party_name - 党组织名称
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * 设置党组织名称
     *
     * @param partyName 党组织名称
     */
    public void setPartyName(String partyName) {
        this.partyName = partyName == null ? null : partyName.trim();
    }

    /**
     * 获取建制
     *
     * @return org_system - 建制
     */
    public String getOrgSystem() {
        return orgSystem;
    }

    /**
     * 设置建制
     *
     * @param orgSystem 建制
     */
    public void setOrgSystem(String orgSystem) {
        this.orgSystem = orgSystem == null ? null : orgSystem.trim();
    }

    /**
     * 获取党员人数
     *
     * @return member_amount - 党员人数
     */
    public String getMemberAmount() {
        return memberAmount;
    }

    /**
     * 设置党员人数
     *
     * @param memberAmount 党员人数
     */
    public void setMemberAmount(String memberAmount) {
        this.memberAmount = memberAmount == null ? null : memberAmount.trim();
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
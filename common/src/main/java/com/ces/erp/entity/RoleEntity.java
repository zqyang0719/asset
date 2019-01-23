package com.ces.erp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    private String code;

    private String comments;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_user")
    private String modifyUser;

    @Column(name = "modify_time")
    private Date modifyTime;

    private Long status;

    @Column(name = "approval_status")
    private Long approvalStatus;

    @Column(name = "show_order")
    private BigDecimal showOrder;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "is_public")
    private Long isPublic;

    @Column(name = "unit_id")
    private String unitId;

    @Column(name = "name_first_spell")
    private String nameFirstSpell;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * @return tenant_id
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * @return create_user
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modify_user
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * @param modifyUser
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * @return approval_status
     */
    public Long getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * @param approvalStatus
     */
    public void setApprovalStatus(Long approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * @return show_order
     */
    public BigDecimal getShowOrder() {
        return showOrder;
    }

    /**
     * @param showOrder
     */
    public void setShowOrder(BigDecimal showOrder) {
        this.showOrder = showOrder;
    }

    /**
     * @return system_id
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * @param systemId
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    /**
     * @return is_public
     */
    public Long getIsPublic() {
        return isPublic;
    }

    /**
     * @param isPublic
     */
    public void setIsPublic(Long isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * @return unit_id
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * @param unitId
     */
    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    /**
     * @return name_first_spell
     */
    public String getNameFirstSpell() {
        return nameFirstSpell;
    }

    /**
     * @param nameFirstSpell
     */
    public void setNameFirstSpell(String nameFirstSpell) {
        this.nameFirstSpell = nameFirstSpell == null ? null : nameFirstSpell.trim();
    }
}
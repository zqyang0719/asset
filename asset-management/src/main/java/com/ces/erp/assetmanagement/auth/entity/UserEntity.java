package com.ces.erp.assetmanagement.auth.entity;

import com.ces.erp.entity.ResourceEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "t_account")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    @Column(name = "login_name")
    private String loginName;

    private String salt;

    @Column(name = "open_id")
    private String openId;

    @Column(name = "open_secret")
    private String openSecret;

    @Column(name = "is_temporary")
    private Long isTemporary;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    private Long status;

    @Column(name = "approval_status")
    private Long approvalStatus;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "modify_user")
    private String modifyUser;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    private String password;

    private String email;

    @Column(name = "validata_code")
    private String validataCode;

    @Column(name = "validata_out_date")
    private Date validataOutDate;

    @Column(name = "last_login_ip")
    private String lastLoginIp;

    @Column(name = "last_login_date")
    private Date lastLoginDate;

    @Column(name = "login_time")
    private Date loginTime;

    @Column(name = "modify_password_time")
    private Date modifyPasswordTime;

    @Column(name = "begin_valid_time")
    private Date beginValidTime;

    @Column(name = "end_valid_time")
    private Date endValidTime;

    @Column(name = "identity_id")
    private String identityId;

    @Column(name = "is_superadmin")
    private Long isSuperadmin;

    @Column(name = "unit_id")
    private String unitId;

    private List<ResourceEntity> permissions;

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

    public List<ResourceEntity> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<ResourceEntity> permissions) {
        this.permissions = permissions;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return login_name
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * @return open_secret
     */
    public String getOpenSecret() {
        return openSecret;
    }

    /**
     * @param openSecret
     */
    public void setOpenSecret(String openSecret) {
        this.openSecret = openSecret == null ? null : openSecret.trim();
    }

    /**
     * @return is_temporary
     */
    public Long getIsTemporary() {
        return isTemporary;
    }

    /**
     * @param isTemporary
     */
    public void setIsTemporary(Long isTemporary) {
        this.isTemporary = isTemporary;
    }

    /**
     * @return start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return end_date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return validata_code
     */
    public String getValidataCode() {
        return validataCode;
    }

    /**
     * @param validataCode
     */
    public void setValidataCode(String validataCode) {
        this.validataCode = validataCode == null ? null : validataCode.trim();
    }

    /**
     * @return validata_out_date
     */
    public Date getValidataOutDate() {
        return validataOutDate;
    }

    /**
     * @param validataOutDate
     */
    public void setValidataOutDate(Date validataOutDate) {
        this.validataOutDate = validataOutDate;
    }

    /**
     * @return last_login_ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * @param lastLoginIp
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * @return last_login_date
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * @param lastLoginDate
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * @return login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return modify_password_time
     */
    public Date getModifyPasswordTime() {
        return modifyPasswordTime;
    }

    /**
     * @param modifyPasswordTime
     */
    public void setModifyPasswordTime(Date modifyPasswordTime) {
        this.modifyPasswordTime = modifyPasswordTime;
    }

    /**
     * @return begin_valid_time
     */
    public Date getBeginValidTime() {
        return beginValidTime;
    }

    /**
     * @param beginValidTime
     */
    public void setBeginValidTime(Date beginValidTime) {
        this.beginValidTime = beginValidTime;
    }

    /**
     * @return end_valid_time
     */
    public Date getEndValidTime() {
        return endValidTime;
    }

    /**
     * @param endValidTime
     */
    public void setEndValidTime(Date endValidTime) {
        this.endValidTime = endValidTime;
    }

    /**
     * @return identity_id
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * @param identityId
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId == null ? null : identityId.trim();
    }

    /**
     * @return is_superadmin
     */
    public Long getIsSuperadmin() {
        return isSuperadmin;
    }

    /**
     * @param isSuperadmin
     */
    public void setIsSuperadmin(Long isSuperadmin) {
        this.isSuperadmin = isSuperadmin;
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
}
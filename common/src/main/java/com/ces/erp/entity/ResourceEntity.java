package com.ces.erp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_resources")
public class ResourceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "parent_id")
    private String parentId;

    private String name;

    private String code;

    private String url;

    @Column(name = "image_url")
    private String imageUrl;

    private String comments;

    private Long typing;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "system_code")
    private String systemCode;

    @Column(name = "tenant_id")
    private String tenantId;

    private Long status;

    @Column(name = "approval_status")
    private Long approvalStatus;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_user")
    private String modifyUser;

    @Column(name = "modify_time")
    private Date modifyTime;

    @Column(name = "show_order")
    private BigDecimal showOrder;

    @Column(name = "is_menu")
    private Long isMenu;

    @Column(name = "module_id")
    private String moduleId;

    @Column(name = "source_file")
    private String sourceFile;

    @Column(name = "invoke_function")
    private String invokeFunction;

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
     * @return parent_id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
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
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
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
     * @return typing
     */
    public Long getTyping() {
        return typing;
    }

    /**
     * @param typing
     */
    public void setTyping(Long typing) {
        this.typing = typing;
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
     * @return system_code
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * @param systemCode
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
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
     * @return is_menu
     */
    public Long getIsMenu() {
        return isMenu;
    }

    /**
     * @param isMenu
     */
    public void setIsMenu(Long isMenu) {
        this.isMenu = isMenu;
    }

    /**
     * @return module_id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * @param moduleId
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    /**
     * @return source_file
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * @param sourceFile
     */
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile == null ? null : sourceFile.trim();
    }

    /**
     * @return invoke_function
     */
    public String getInvokeFunction() {
        return invokeFunction;
    }

    /**
     * @param invokeFunction
     */
    public void setInvokeFunction(String invokeFunction) {
        this.invokeFunction = invokeFunction == null ? null : invokeFunction.trim();
    }
}
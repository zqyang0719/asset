package com.ces.erp.assetmanagement.biz.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_am_financial_situation")
public class FinancialSituation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 企业id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 分类
     */
    private String classification;

    /**
     * 项目
     */
    private String project;

    /**
     * 年份
     */
    private String year;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 删除人id
     */
    @Column(name = "delete_user_id")
    private String deleteUserId;

    /**
     * 删除人
     */
    @Column(name = "delete_user")
    private String deleteUser;

    /**
     * 删除时间
     */
    @Column(name = "delete_time")
    private Date deleteTime;

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
     * 获取企业id
     *
     * @return company_id - 企业id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置企业id
     *
     * @param companyId 企业id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 获取分类
     *
     * @return classification - 分类
     */
    public String getClassification() {
        return classification;
    }

    /**
     * 设置分类
     *
     * @param classification 分类
     */
    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }

    /**
     * 获取项目
     *
     * @return project - 项目
     */
    public String getProject() {
        return project;
    }

    /**
     * 设置项目
     *
     * @param project 项目
     */
    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取删除人id
     *
     * @return delete_user_id - 删除人id
     */
    public String getDeleteUserId() {
        return deleteUserId;
    }

    /**
     * 设置删除人id
     *
     * @param deleteUserId 删除人id
     */
    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    /**
     * 获取删除人
     *
     * @return delete_user - 删除人
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * 设置删除人
     *
     * @param deleteUser 删除人
     */
    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    /**
     * 获取删除时间
     *
     * @return delete_time - 删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置删除时间
     *
     * @param deleteTime 删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
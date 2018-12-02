package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import java.util.Date;
import javax.persistence.*;

/**
 * 信访矛盾排查信息
 */
@Table(name = "t_am_contradiction")
public class ContradictionEntity extends BaseEntity{
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
     * 姓名
     */
    private String name;

    /**
     * 矛盾概况
     */
    private String overview;

    /**
     * 涉及人数
     */
    @Column(name = "member_amount")
    private String memberAmount;

    /**
     * 预案或处置措施
     */
    private String solution;

    /**
     * 包案责任人及联系方式
     */
    @Column(name = "resp_man")
    private String respMan;

    /**
     * 矛盾表现形式
     */
    private String form;

    /**
     * 矛盾现状
     */
    @Column(name = "curr_situation")
    private String currSituation;


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
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取矛盾概况
     *
     * @return overview - 矛盾概况
     */
    public String getOverview() {
        return overview;
    }

    /**
     * 设置矛盾概况
     *
     * @param overview 矛盾概况
     */
    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    /**
     * 获取涉及人数
     *
     * @return member_amount - 涉及人数
     */
    public String getMemberAmount() {
        return memberAmount;
    }

    /**
     * 设置涉及人数
     *
     * @param memberAmount 涉及人数
     */
    public void setMemberAmount(String memberAmount) {
        this.memberAmount = memberAmount == null ? null : memberAmount.trim();
    }

    /**
     * 获取预案或处置措施
     *
     * @return solution - 预案或处置措施
     */
    public String getSolution() {
        return solution;
    }

    /**
     * 设置预案或处置措施
     *
     * @param solution 预案或处置措施
     */
    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }

    /**
     * 获取包案责任人及联系方式
     *
     * @return resp_man - 包案责任人及联系方式
     */
    public String getRespMan() {
        return respMan;
    }

    /**
     * 设置包案责任人及联系方式
     *
     * @param respMan 包案责任人及联系方式
     */
    public void setRespMan(String respMan) {
        this.respMan = respMan == null ? null : respMan.trim();
    }

    /**
     * 获取矛盾表现形式
     *
     * @return form - 矛盾表现形式
     */
    public String getForm() {
        return form;
    }

    /**
     * 设置矛盾表现形式
     *
     * @param form 矛盾表现形式
     */
    public void setForm(String form) {
        this.form = form == null ? null : form.trim();
    }

    /**
     * 获取矛盾现状
     *
     * @return curr_situation - 矛盾现状
     */
    public String getCurrSituation() {
        return currSituation;
    }

    /**
     * 设置矛盾现状
     *
     * @param currSituation 矛盾现状
     */
    public void setCurrSituation(String currSituation) {
        this.currSituation = currSituation == null ? null : currSituation.trim();
    }

}
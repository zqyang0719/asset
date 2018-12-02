package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import java.util.Date;
import javax.persistence.*;

/**
 * 商标专利实体类
 */
@Table(name = "t_am_trademark_patent")
public class TrademarkPatentEntity extends BaseEntity{
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
     * 商标注册号
     */
    @Column(name = "trademark_number")
    private String trademarkNumber;

    /**
     * 图案
     */
    private String logo;

    /**
     * 商品/服务项目
     */
    @Column(name = "product_service")
    private String productService;

    /**
     * 类别
     */
    private String category;

    /**
     * 商标到期日
     */
    @Column(name = "due_date")
    private String dueDate;

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
     * 获取商标注册号
     *
     * @return trademark_number - 商标注册号
     */
    public String getTrademarkNumber() {
        return trademarkNumber;
    }

    /**
     * 设置商标注册号
     *
     * @param trademarkNumber 商标注册号
     */
    public void setTrademarkNumber(String trademarkNumber) {
        this.trademarkNumber = trademarkNumber == null ? null : trademarkNumber.trim();
    }

    /**
     * 获取图案
     *
     * @return logo - 图案
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置图案
     *
     * @param logo 图案
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 获取商品/服务项目
     *
     * @return product_service - 商品/服务项目
     */
    public String getProductService() {
        return productService;
    }

    /**
     * 设置商品/服务项目
     *
     * @param productService 商品/服务项目
     */
    public void setProductService(String productService) {
        this.productService = productService == null ? null : productService.trim();
    }

    /**
     * 获取类别
     *
     * @return category - 类别
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置类别
     *
     * @param category 类别
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 获取商标到期日
     *
     * @return due_date - 商标到期日
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * 设置商标到期日
     *
     * @param dueDate 商标到期日
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate == null ? null : dueDate.trim();
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
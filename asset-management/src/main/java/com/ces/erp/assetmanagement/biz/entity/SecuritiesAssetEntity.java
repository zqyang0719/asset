package com.ces.erp.assetmanagement.biz.entity;

import com.ces.erp.assetmanagement.base.entity.BaseEntity;

import javax.persistence.*;

/**
 * 证券资产信息
 */
@Table(name = "t_am_securities_asset")
public class SecuritiesAssetEntity extends BaseEntity{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 证券名称
     */
    @Column(name = "securities_name")
    private String securitiesName;

    /**
     * 证券代码
     */
    @Column(name = "securities_code")
    private String securitiesCode;

    /**
     * 交易所
     */
    private String exchange;

    /**
     * 股东账号
     */
    private String account;

    /**
     * 当前持仓数量
     */
    @Column(name = "position_amount")
    private Double positionAmount;

    /**
     * 投资成本
     */
    private Double investment;

    /**
     * 最新市值
     */
    @Column(name = "market_value")
    private Double marketValue;

    /**
     * 合计盈亏
     */
    @Column(name = "profit_loss")
    private Double profitLoss;

    /**
     * 备注
     */
    private String remark;

    /**
     * company_id
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
     * 获取证券名称
     *
     * @return securities_name - 证券名称
     */
    public String getSecuritiesName() {
        return securitiesName;
    }

    /**
     * 设置证券名称
     *
     * @param securitiesName 证券名称
     */
    public void setSecuritiesName(String securitiesName) {
        this.securitiesName = securitiesName == null ? null : securitiesName.trim();
    }

    /**
     * 获取证券代码
     *
     * @return securities_code - 证券代码
     */
    public String getSecuritiesCode() {
        return securitiesCode;
    }

    /**
     * 设置证券代码
     *
     * @param securitiesCode 证券代码
     */
    public void setSecuritiesCode(String securitiesCode) {
        this.securitiesCode = securitiesCode == null ? null : securitiesCode.trim();
    }

    /**
     * 获取交易所
     *
     * @return exchange - 交易所
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * 设置交易所
     *
     * @param exchange 交易所
     */
    public void setExchange(String exchange) {
        this.exchange = exchange == null ? null : exchange.trim();
    }

    /**
     * 获取股东账号
     *
     * @return account - 股东账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置股东账号
     *
     * @param account 股东账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取当前持仓数量
     *
     * @return position_amount - 当前持仓数量
     */
    public Double getPositionAmount() {
        return positionAmount;
    }

    /**
     * 设置当前持仓数量
     *
     * @param positionAmount 当前持仓数量
     */
    public void setPositionAmount(Double positionAmount) {
        this.positionAmount = positionAmount;
    }

    /**
     * 获取投资成本
     *
     * @return investment - 投资成本
     */
    public Double getInvestment() {
        return investment;
    }

    /**
     * 设置投资成本
     *
     * @param investment 投资成本
     */
    public void setInvestment(Double investment) {
        this.investment = investment;
    }

    /**
     * 获取最新市值
     *
     * @return market_value - 最新市值
     */
    public Double getMarketValue() {
        return marketValue;
    }

    /**
     * 设置最新市值
     *
     * @param marketValue 最新市值
     */
    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    /**
     * 获取合计盈亏
     *
     * @return profit_loss - 合计盈亏
     */
    public Double getProfitLoss() {
        return profitLoss;
    }

    /**
     * 设置合计盈亏
     *
     * @param profitLoss 合计盈亏
     */
    public void setProfitLoss(Double profitLoss) {
        this.profitLoss = profitLoss;
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
}
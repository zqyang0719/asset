package com.ces.erp.assetmanagement.base.entity;


import com.ces.erp.assetmanagement.common.util.StringUtils;

public class ResultInfo {

	private String status;
    private Object data;
    private String errorCode;
    private String errorMsg;
    
    public ResultInfo() {}
    
    /**
     * @desc 执行结果
     * @author zdw
     * @param status 状态
     * @param data 数据
     * @param errorCode 错误代码
     * @param errorMsg 错误信息
     * @date 2018年11月10日
     */
    public ResultInfo(String status, Object data, String errorCode, String errorMsg) {
    	if(!StringUtils.isNullOrEmpty(status)) {
    		this.status = status;
    	} else {
    		this.status = "success";
    	}
    	this.data = data;
    	if(!StringUtils.isNullOrEmpty(errorCode)) {
    		this.errorCode = errorCode;
    	} else {
    		this.errorCode = "200";
    	}
    	this.errorMsg = errorMsg;
    }

    /**
     * 操作结果，通常情况下返回success或者error，其他特殊状态再自行定义
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 结果数据
     *
     * @return
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 异常码
     *
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 错误信息
     *
     * @return
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "ResultInfo [status=" + status + ", data=" + data + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
    }
}

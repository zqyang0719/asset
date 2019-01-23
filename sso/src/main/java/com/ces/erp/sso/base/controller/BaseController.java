package com.ces.erp.sso.base.controller;

import com.ces.erp.model.ResultInfo;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/3 11:08
 * @Description:
 */
public class BaseController {
    public ResultInfo setReturnResult(String status, Object data, String errorCode, String errorMsg) {
        return new ResultInfo(status, data, errorCode, errorMsg);
    }
}

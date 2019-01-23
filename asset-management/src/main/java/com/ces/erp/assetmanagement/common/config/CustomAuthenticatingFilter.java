package com.ces.erp.assetmanagement.common.config;

import com.ces.erp.assetmanagement.base.entity.ResultInfo;
import com.ces.erp.assetmanagement.common.util.CookieUtil;
import com.ces.erp.assetmanagement.common.util.HttpClientUtil;
import com.ces.erp.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/5 13:59
 * @Description:
 */
public class CustomAuthenticatingFilter extends AuthorizationFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        HttpServletRequest request_ = (HttpServletRequest)request;
        HttpServletResponse response_ = (HttpServletResponse)response;
        HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String token = req.getParameter("token");
        Subject subject = SecurityUtils.getSubject();
//        PropertiesTool propertiesTool = PropertiesTool.getInstance();
//        String ssoServiceUrl = propertiesTool.getValue("ssoServiceUrl");
//        String tokenValidateUrl = propertiesTool.getValue("tokenValidateUrl");

        if(null == token) {
            Cookie cookie = CookieUtil.getCookieByName(req, "token");
            if(null != cookie) {
                token = cookie.getValue();
            }
        }
        if(token == null){
            return false;
        }
        String result = HttpClientUtil.doGet("http://localhost:8001/token/"+token);
        ResultInfo resultInfo = JsonUtils.jsonToPojo(result,ResultInfo.class);
        if(StringUtils.isNotBlank(result) && resultInfo != null){//验证成功，跳转至首页，并从redis中获取权限
            if(resultInfo.getStatus().equals("200")){
                //             UserEntity user = (UserEntity) resultInfo.getData();
                //  SystemSession.setUser(SSOTokenUtil.getToken(request));//设置系统session(把用户信息保存在ThreadLocal中)
                Cookie cookie = new Cookie("token", token);
                cookie.setPath("/");
                response_.addCookie(cookie);
            }else{
                return false;//验证失败，重定向至sso server登录页
            }
        } else{
            return false;//验证失败，重定向至sso server登录页
        }
        return false;
    }
}

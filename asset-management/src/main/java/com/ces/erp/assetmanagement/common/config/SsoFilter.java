package com.ces.erp.assetmanagement.common.config;

import com.ces.erp.assetmanagement.base.entity.ResultInfo;
import com.ces.erp.assetmanagement.common.repository.JedisClient;
import com.ces.erp.assetmanagement.common.util.CookieUtil;
import com.ces.erp.assetmanagement.common.util.HttpClientUtil;
import com.ces.erp.entity.UserEntity;
import com.ces.erp.util.AESUtil;
import com.ces.erp.util.JsonUtils;
import com.ces.erp.util.SystemSession;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/3 09:08
 * @Description:
 */
@Component
@PropertySource(value = "classpath:app.properties")
public class SsoFilter implements Filter{
    @Value("${ssoServiceUrl}")
    private String ssoServiceUrl = "http://localhost:8001/login";

    @Value("${tokenValidateUrl}")
    private String tokenValidateUrl = "http://localhost:8001/token";

    @Value("${JedisUrl}")
    private String JedisUrl = "JedisUrl=localhost\n";

    @Value("${JedisPort}")
    private String JedisPort = "6379";

    @Autowired
    private JedisClient jedisClient;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String token = request.getParameter("token");
//        PropertiesTool propertiesTool = PropertiesTool.getInstance();
//        String ssoServiceUrl = propertiesTool.getValue("ssoServiceUrl");
//        String tokenValidateUrl = propertiesTool.getValue("tokenValidateUrl");

        if(null == token) {
            Cookie cookie = CookieUtil.getCookieByName(request, "token");
            if(null != cookie) {
                token = cookie.getValue();
            }
        }
        String basePath = request.getRequestURL().toString();
        String urlString = request.getRequestURI();
        String paramString = request.getQueryString();
        String redirectUrl = ssoServiceUrl+"?redirect="+ AESUtil.aesEncode(basePath+(paramString!=null?"?"+paramString:""));
        if(null == token) {
            //没有token，重定向至sso server登录页
            response.sendRedirect(redirectUrl);
        }else {
            if(urlString.endsWith("/logout")) {
//                String JedisUrl = propertiesTool.getValue("JedisUrl");
//                String JedisPort = propertiesTool.getValue("JedisPort");
//                RedisProperties.Jedis jedis = new RedisProperties.Jedis(JedisUrl, Integer.parseInt(JedisPort));
//                jedis.del(token.getBytes());
//                jedis.close();
                SecurityUtils.getSubject().logout();
                response.sendRedirect(redirectUrl);//重定向至sso server登录页
                return;
            }

            //有token,去sso server验证token的有效性
            Map<String, String> map = new HashMap<>();
            map.put("token", token);
//            String result = HttpClientUtil.doGet(tokenValidateUrl, map);
            String result = HttpClientUtil.doGet("http://localhost:8001/token/"+token);
            ResultInfo resultInfo = JsonUtils.jsonToPojo(result,ResultInfo.class);
            if(StringUtils.isNotBlank(result) && resultInfo != null){//验证成功，跳转至首页，并从redis中获取权限
                if(resultInfo.getStatus().equals("200")){
                    UserEntity user = (UserEntity) JsonUtils.jsonToPojo(JsonUtils.objectToJson(resultInfo.getData()),UserEntity.class);
                    //  SystemSession.setUser(SSOTokenUtil.getToken(request));//设置系统session(把用户信息保存在ThreadLocal中)
                    SystemSession.setUser(user);
                    UserEntity user1 = SystemSession.getUser();
                    Cookie cookie = new Cookie("token", token);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                    filterChain.doFilter(request, response);
                }else{
                    response.sendRedirect(redirectUrl);//验证失败，重定向至sso server登录页
                }
            } else{
                response.sendRedirect(redirectUrl);//验证失败，重定向至sso server登录页
            }
        }
    }
}

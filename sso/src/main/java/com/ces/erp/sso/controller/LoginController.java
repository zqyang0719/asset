package com.ces.erp.sso.controller;

import com.ces.erp.model.ResultInfo;
import com.ces.erp.sso.base.controller.BaseController;
import com.ces.erp.sso.base.service.IUserService;
import com.ces.erp.sso.common.repository.JedisClient;
import com.ces.erp.sso.entity.ResourceEntity;
import com.ces.erp.sso.entity.UserEntity;
import com.ces.erp.sso.service.IResourceService;
import com.ces.erp.util.JsonUtils;
import com.ces.erp.util.Md5Encrypt;
import com.ces.erp.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/3 10:33
 * @Description:
 */
@Controller
@Slf4j
public class LoginController extends BaseController{
    @Autowired
    private IUserService userService;
    @Autowired
    private IResourceService resourceService;
    @Autowired
    private JedisClient jedisClient;
    @Value("${REDIS_USER_SESSION_KEY}")
    private String REDIS_USER_SESSION_KEY;

    @Value("${SSO_SESSION_EXPIRE}")
    private Integer SSO_SESSION_EXPIRE;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    @ResponseBody
    public ResultInfo userLogin(String username, String password,
                                HttpServletRequest request, HttpServletResponse response) {
        String status = "error";
        String errorMsg = null;
        String errorCode = null;
        String mobile = username;
        Subject subject = SecurityUtils.getSubject();
        UserEntity user = userService.queryUserByMobile(mobile);
        //验证用户是否登录
        if(!subject.isAuthenticated()) {
            //把用户信息封装为 UsernamePasswordToken对象
            if(StringUtils.isNullOrEmpty(mobile) || StringUtils.isNullOrEmpty(password)) {
                status = "error";
                errorMsg = "请先登录！";
            } else {
                UsernamePasswordToken token = new UsernamePasswordToken(mobile, Md5Encrypt.encrypt(password));
                //remembermMe记住密码
//				token.setRememberMe(true);
                try {
                    //执行登录
                    subject.login(token);
                    status = "success";
                    user = userService.queryUserByMobile(mobile);
                    List<ResourceEntity> permissions = resourceService.getPermissionByMobile(mobile);
                    user.setPermissions(permissions);
                    //将用户信息存到session中
                    request.getSession().setAttribute("userInfo", user);
                    //将用户信息保存到redis中
                    //TODO
                    //将token保存到cookie中
                    // 把用户信息写入 redis
                    String key = user.getId()+ System.currentTimeMillis();
                    jedisClient.set(REDIS_USER_SESSION_KEY + ":" + key, JsonUtils.objectToJson(user));
                    // user 已经是持久化对象了，被保存在了session缓存当中，若user又重新修改了属性值，那么在提交事务时，此时 hibernate对象就会拿当前这个user对象和保存在session缓存中的user对象进行比较，如果两个对象相同，则不会发送update语句，否则，如果两个对象不同，则会发出update语句。
                    // 设置 session 的过期时间
                    jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + key, SSO_SESSION_EXPIRE);
                    Cookie cookie = new Cookie("token",key);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                    //登录成功
                } catch(IncorrectCredentialsException e) {
                    status = "error";
                    errorMsg = "密码错误，请重新输入！";
                    errorCode = "400";
                    log.error(e.getMessage());
                } catch(ExcessiveAttemptsException e) {
                    status = "error";
                    errorMsg = "登录失败次数过多！";
                    errorCode = "400";
                    log.error(e.getMessage());
                } catch(LockedAccountException e) {
                    status = "error";
                    errorCode = "400";
                    errorMsg = "该帐号已被锁定！";
                    log.error(e.getMessage());
                } catch(DisabledAccountException e) {
                    status = "error";
                    errorCode = "400";
                    errorMsg = "该帐号已被禁用！";
                    log.error(e.getMessage());
                } catch(ExpiredCredentialsException e) {
                    status = "error";
                    errorCode = "400";
                    errorMsg = "该帐号已过期！";
                    log.error(e.getMessage());
                } catch(UnknownAccountException e) {
                    status = "error";
                    errorCode = "400";
                    errorMsg = "帐号不存在，请重新输入！";
                    log.error(e.getMessage());
                } catch(UnauthorizedException e) {
                    status = "error";
                    errorCode = "403";
                    errorMsg = "权限不足，请联系管理员！";
                    log.error(e.getMessage());
                } catch(Exception e) {
                    status = "error";
                    errorCode = "403";
                    errorMsg = "权限不足，请联系管理员！";
                    log.error(e.getMessage());
                }
            }
        } else {
            try {
                user = userService.queryUserByMobile(mobile);
                List<ResourceEntity> permissions = resourceService.getPermissionByMobile(mobile);
                user.setPermissions(permissions);
                //将用户信息存到session中
                request.getSession().setAttribute("userInfo", user);
                status = "success";
                String token = user.getId()+ System.currentTimeMillis();
                Cookie cookie = new Cookie("token",token);
                cookie.setPath("/");
                response.addCookie(cookie);
                //TODO
                //将token保存到cookie中
                // 把用户信息写入 redis
                jedisClient.set(REDIS_USER_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
                // user 已经是持久化对象了，被保存在了session缓存当中，若user又重新修改了属性值，那么在提交事务时，此时 hibernate对象就会拿当前这个user对象和保存在session缓存中的user对象进行比较，如果两个对象相同，则不会发送update语句，否则，如果两个对象不同，则会发出update语句。
                // 设置 session 的过期时间
                jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
            } catch (Exception e) {
                status = "error";
                errorCode = "400";
                log.error(e.getMessage());
            }
        }
        return setReturnResult(status, user, errorCode, errorMsg);
    }

    @RequestMapping("/token/{token}")
    @ResponseBody
    public Object getUserByToken(@PathVariable String token) {
        ResultInfo resultInfo = new ResultInfo();
        try {
            resultInfo = userService.queryUserByToken(token);
//            resultInfo.setData(user);
//            resultInfo.setStatus("success");
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo.setStatus("error");
        }
        return resultInfo;
    }
}

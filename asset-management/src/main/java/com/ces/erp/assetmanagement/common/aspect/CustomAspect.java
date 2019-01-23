package com.ces.erp.assetmanagement.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/6 18:17
 * @Description:自定义切面
 */
@Component
@Aspect
public class CustomAspect {
    /**
     * 定义切点，自定义记录日志
     */
    @Pointcut("@annotation(com.ces.erp.annotation.CustomLogger)")
    public void customLogger(){}

    /**
     * 日志操作
     */
    @Before("customLogger()")
    public void logOpeartion(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();  //类名
        String methodName = joinPoint.getSignature().getName();//方法名
        Object[] args = joinPoint.getArgs();    //参数

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();
//        logger.info("URL : " + request.getRequestURL().toString());
//        logger.info("HTTP_METHOD : " + request.getMethod());
//        logger.info("IP : " + request.getRemoteAddr());
//        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }
}

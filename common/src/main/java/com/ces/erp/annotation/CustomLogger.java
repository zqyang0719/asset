package com.ces.erp.annotation;

import java.lang.annotation.*;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/6 18:13
 * @Description:自定义操作日志
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomLogger {
}

package com.ces.erp.assetmanagement.common.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

public class CommonUtils {
	/**
     * 将Object转换成String,如果Object为null则返回空字符串
     *
     * @param obj
     * @return
     * @date 2013-11-6 下午7:54:39
     */
    public static String toStr(Object obj) {
        return obj == null ? "" : String.valueOf(obj);
    }

    /**
     * 创建唯一ID
     * @return
     */
    public static String createId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
    
    /**
     * @desc 获取request
     * @author zdw
     * @return HttpServletRequest
     * @date 2018年11月11日
     */
    public static HttpServletRequest getRequest() {
    	return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
    }
    
    /**
     * @desc 获取session
     * @author zdw
     * @return HttpSession
     * @date 2018年11月11日
     */
    public static HttpSession getSession() {
    	return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
    }
    

    /** DATE_PATTERN(String):yyyy-MM-dd. */
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    
    /** DATETIME_PATTERN(String):yyyy-MM-dd HH:mm:ss. */
	public static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
    /**
	 * 日期格式转换
	 * @author TYC
	 * @date 2018年11月09日
	 */
	public static final String toString(Date date, String pattern) {
		String result = null;
		if (date != null) {
			result = DateFormatUtils.format(date, pattern);
		}
		return result;
	}
	
	/**
	 * 获取当前日期 yyyy-MM-dd
	 * @return
	 */
	public static String getCurrDateYMD(){
		return toString(new Date(), DATE_PATTERN);
	}
	
	/**
	 * 获取当前日期 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getCurrDateTime(){
		return toString(new Date(), DATETIME_PATTERN);
	}
	
	 
    public static String createRandomNo() {
		
		String randomNo = getRandomAlphabet() + getRandomAlphabet() + getRandomNumber() + getRandomNumber();
		
		return randomNo;
	}
	
	private static String getRandomNumber() {
		int number = (int)(Math.random() * 100);
		return String.valueOf(number);
	}

	private static String getRandomAlphabet() {
		
		char alphebet = (char)(Math.random()*26+'A');
		return String.valueOf(alphebet);
	}

	public static Boolean isNull(Object o){
		if(o == null || o.toString().equals("")){
			return true;
		}
		return false;
	}

}
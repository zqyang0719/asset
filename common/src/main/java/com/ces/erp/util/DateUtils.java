package com.ces.erp.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @desc 日期转换工具类
 * @author zdw
 * @date 2018年11月11日
 */
public class DateUtils {
	
	private static String DATE = "yyyy-MM-dd hh:mm:sss";
	
	private static String DATE_TIME = "yyyy-MM-dd hh:mm:sss";
	
	/**
	 * @desc 日期转字符串
	 * @author zdw
	 * @param date 日期
	 * @return String 格式：yyyy-MM-dd
	 * @date 2018年11月11日
	 */
	public static String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE);
		return sdf.format(date);
	}
	
	/**
	 * @desc 日期转字符串
	 * @author zdw
	 * @param date 日期
	 * @return String 格式：yyyy-MM-dd hh:mm:ss
	 * @date 2018年11月11日
	 */
	public static String formatDateTime(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME);
		return sdf.format(date);
	}

	/**
	 * @desc 字符串转日期
	 * @author zdw
	 * @param date 日期
	 * @return 格式：yyyy-MM-dd
	 * @date 2018年11月11日
	 */
	public static Date parseDate(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(DATE);
			return sdf.parse(date);
		} catch (ParseException e) {
		}
		return null;
	}
	
	/**
	 * @desc 字符串转日期
	 * @author zdw
	 * @param date 日期
	 * @return 格式：yyyy-MM-dd hh:mm:ss
	 * @date 2018年11月11日
	 */
	public static Date parseDateTime(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME);
			return sdf.parse(date);
		} catch (ParseException e) {
		}
		return null;
	}
}
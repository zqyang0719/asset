package com.ces.erp.util;

public class StringUtils {

	public static boolean isNullOrEmpty(String toTest) {
		return (toTest == null || toTest.isEmpty());
	}
	
	/**
	 * @desc 判断是否为空
	 * @author zdw
	 * @param obj 对象
	 * @return 校验结果
	 * @date 2018年11月11日
	 */
	public static boolean isEmpty(Object obj) {
		if(null == obj || "".equals(obj)) {
			return true;
		}
		return false;
	}
	
	/**
	 * @desc 判断是否不为空
	 * @author zdw
	 * @param obj 对象
	 * @return 校验结果
	 * @date 2018年11月11日
	 */
	public static boolean isNotEmpty(Object obj) {
		if(null != obj && !"".equals(obj)) {
			return true;
		}
		return false;
	}
}
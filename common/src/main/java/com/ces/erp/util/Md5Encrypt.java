package com.ces.erp.util;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @desc MD5加密
 * @author zdw
 * @date 2018年11月9日
 */
public class Md5Encrypt {

	/**
	 * @desc MD5加密
	 * @author zdw
	 * @param text 要加密的文本
	 * @return String 加密后的字符串
	 * @date 2018年11月9日
	 */
	public static String encrypt(String text) {
		String encryptText = null;
		try {
			if(StringUtils.isEmpty(text)) {
				throw new IllegalArgumentException("请输入要加密的内容");
			}
			MessageDigest m = MessageDigest.getInstance("md5");
			m.update(text.getBytes("UTF8"));
			byte s[] = m.digest();
			return hex(s);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return encryptText;
	}

	/**
	 * @desc 返回十六进制字符串
	 * @author zdw
	 * @param arr
	 * @return
	 * @date 2018年11月9日
	 */
	private static String hex(byte[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; ++i) {
			sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String md5 = encrypt("personal");//MD5加密测试
	}
}
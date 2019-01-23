package com.ces.erp.assetmanagement.common.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest; /**
 * @Auther: zhou.qian
 * @Date: 2018/12/3 09:13
 * @Description:
 */
public class CookieUtil {
    public static Cookie getCookieByName(HttpServletRequest request, String token) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length>0){
            for (Cookie cookie : cookies){
                if(cookie.getName().equals(token)){
                    return cookie;
                }
            }
        }
        return null;
    }
}

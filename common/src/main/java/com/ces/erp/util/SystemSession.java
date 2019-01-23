package com.ces.erp.util;


import com.ces.erp.entity.ResourceEntity;
import com.ces.erp.entity.UserEntity;
import org.thymeleaf.util.StringUtils;

import java.util.Iterator;
import java.util.List;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/5 20:31
 * @Description:
 */
public class SystemSession {
    //声明
    private static ThreadLocal<UserEntity> local = new ThreadLocal<UserEntity>();

    private static ThreadLocal<List<ResourceEntity>> permissionLocal = new ThreadLocal<List<ResourceEntity>>();
    /**
     * 赋值
     * @param session
     */
    public static void setUser(UserEntity session) {
        local.set(session);
    }
    /**
     * 取值
     * @return
     */
    public static UserEntity getUser() {
        return local.get();
    }
    /**
     * 移除
     */
    public static void remove(){
        local.remove();
    }

    /**
     * 设置权限
     * @param permissions
     */
    public static void setPermissions(List<ResourceEntity> permissions){
        permissionLocal.set(permissions);
    }

    /**
     * 获取权限
     * @return
     */
    public static List<ResourceEntity> getPermissions(){
        return permissionLocal.get();
    }

    /**
     * 移除权限
     */
    public static void removePermimissions(){
        permissionLocal.remove();
    }

    public static boolean hasAllRoles(List<String> values) {
        UserEntity user = SystemSession.getUser();
        List<ResourceEntity> permissions = user.getPermissions();
        if(permissions == null || permissions.size() == 0){
            return false;
        }
        Iterator var2 = values.iterator();

        String role;
        do {
            if (!var2.hasNext()) {
                return true;
            }

            role = (String)var2.next();
        } while(hasRole(StringUtils.trim(role),permissions));

        return false;
    }

    private static boolean hasRole(String role, List<ResourceEntity> permissions) {
        for(ResourceEntity r : permissions){
            if(r.getUrl().equals(role)){
                return true;
            }
        }
        return false;
    }
}

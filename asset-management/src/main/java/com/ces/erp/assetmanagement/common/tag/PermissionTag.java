package com.ces.erp.assetmanagement.common.tag;

import com.ces.erp.entity.ResourceEntity;
import com.ces.erp.entity.UserEntity;
import com.ces.erp.util.SystemSession;

import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.List;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/5 20:20
 * @Description:
 */
public class PermissionTag extends TagSupport {

    /* 标签要接收的属性 */
    private String name;

    @Override
    public int doStartTag() {
        try {
            UserEntity user = SystemSession.getUser();
            if (hasPermission(user, name)) {
                // 让标签体显示
                return Tag.EVAL_BODY_INCLUDE;
            } else {
                // 让标签体不显示
                return Tag.SKIP_BODY;
            }
        } catch (Exception e) {
            return Tag.SKIP_BODY;
        }
    }

    private boolean hasPermission(UserEntity user, String name) {
        List<ResourceEntity> permissions = user.getPermissions();
        if(permissions != null && permissions.size()>0){
            for(ResourceEntity p : permissions){
                if(p.getUrl().equals(name)){
                    return true;
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

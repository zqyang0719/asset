package com.ces.erp.sso.service;

import com.ces.erp.sso.entity.ResourceEntity;

import java.util.List;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/4 14:50
 * @Description:
 */
public interface IResourceService {
    List<ResourceEntity> getPermissionByMobile(String mobile);
}

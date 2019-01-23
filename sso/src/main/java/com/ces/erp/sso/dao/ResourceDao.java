package com.ces.erp.sso.dao;

import com.ces.erp.sso.base.mapper.BaseMapper;
import com.ces.erp.sso.entity.ResourceEntity;

import java.util.List;

public interface ResourceDao extends BaseMapper<ResourceEntity> {
    public List<ResourceEntity> getPermissionByMobile(String mobile);
}
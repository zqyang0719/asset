package com.ces.erp.sso.service.impl;

import com.ces.erp.sso.dao.ResourceDao;
import com.ces.erp.sso.entity.ResourceEntity;
import com.ces.erp.sso.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: zhou.qian
 * @Date: 2018/12/4 14:51
 * @Description:
 */
@Service
public class ResourceServiceImpl implements IResourceService{
    @Autowired
    private ResourceDao resourceDao;
    @Override
    public List<ResourceEntity> getPermissionByMobile(String mobile) {
        return resourceDao.getPermissionByMobile(mobile);
    }
}

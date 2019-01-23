package com.ces.erp.sso.dao;

import com.ces.erp.sso.base.mapper.BaseMapper;
import com.ces.erp.sso.entity.UserEntity;

public interface UserDao extends BaseMapper<UserEntity> {
    UserEntity queryUserByMobile(String mobile);
}
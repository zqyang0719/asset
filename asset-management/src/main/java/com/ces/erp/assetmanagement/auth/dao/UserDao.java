package com.ces.erp.assetmanagement.auth.dao;


import com.ces.erp.assetmanagement.auth.entity.UserEntity;

public interface UserDao {

    UserEntity queryUserByMobile(String mobile);
}

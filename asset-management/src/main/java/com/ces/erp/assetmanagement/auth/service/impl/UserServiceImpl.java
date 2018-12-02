package com.ces.erp.assetmanagement.auth.service.impl;


import com.ces.erp.assetmanagement.auth.dao.UserDao;
import com.ces.erp.assetmanagement.auth.entity.UserEntity;
import com.ces.erp.assetmanagement.auth.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    public UserDao userDao;

    @Override
    public UserEntity queryUserByMobile(String mobile) {
        return userDao.queryUserByMobile(mobile);
    }

    @Override
    public UserEntity findByUsername(String username) {
        return null;
    }
}

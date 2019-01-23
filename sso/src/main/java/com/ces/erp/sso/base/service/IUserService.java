package com.ces.erp.sso.base.service;


import com.ces.erp.model.ResultInfo;
import com.ces.erp.sso.entity.UserEntity;

public interface IUserService {
    public UserEntity queryUserByMobile(String mobile);

    public UserEntity findByUsername(String username);

    ResultInfo queryUserByToken(String token);
}

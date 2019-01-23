package com.ces.erp.assetmanagement.auth.service;


import com.ces.erp.assetmanagement.auth.entity.UserEntity;

public interface UserService {
	
	UserEntity getUserByToken(String token);
	public UserEntity queryUserByMobile(String mobile);

	public UserEntity findByUsername(String username);
	
}

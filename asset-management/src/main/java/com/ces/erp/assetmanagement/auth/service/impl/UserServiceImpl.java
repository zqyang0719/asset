package com.ces.erp.assetmanagement.auth.service.impl;


import com.ces.erp.assetmanagement.auth.dao.UserDao;
import com.ces.erp.assetmanagement.auth.entity.UserEntity;
import com.ces.erp.assetmanagement.auth.service.UserService;
import com.ces.erp.assetmanagement.base.entity.ResultInfo;
import com.ces.erp.assetmanagement.common.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource(value = "app.properties")
public class UserServiceImpl implements UserService {
	@Autowired
	public UserDao userDao;
	@Value("${SSO_BASE_URL}")
	public String SSO_BASE_URL;
	@Value("${SSO_DOMAIN_BASE_USRL}")
	public String SSO_DOMAIN_BASE_USRL;
	@Value("${SSO_USER_TOKEN}")
	private String SSO_USER_TOKEN;
	@Value("${SSO_PAGE_LOGIN}")
	public String SSO_PAGE_LOGIN;
	
	
	public UserEntity getUserByToken(String token) {
		try {
			// 调用sso系统的服务，根据token取用户信息
			String json = HttpClientUtil.doGet(SSO_BASE_URL + SSO_USER_TOKEN + token);
			System.out.println("json : " + json);
			// 把json转换成ItdragonResult
			ResultInfo result = ResultInfo.formatToPojo(json, UserEntity.class);
			if (null != result && result.getStatus().equals("success")) {
				UserEntity user = (UserEntity) result.getData();
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserEntity queryUserByMobile(String mobile) {
		return userDao.queryUserByMobile(mobile);
	}

	@Override
	public UserEntity findByUsername(String username) {
		return null;
	}

}

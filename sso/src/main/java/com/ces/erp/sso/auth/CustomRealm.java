package com.ces.erp.sso.auth;


import com.ces.erp.sso.base.service.IUserService;
import com.ces.erp.sso.entity.UserEntity;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomRealm extends AuthorizingRealm {
	
	@Autowired
	private IUserService userService;

	/**
	 * @desc 授权
	 * @author zdw
	 * @param principals
	 * @return
	 * @date 2018年11月9日
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		//如果身份认证的时候没有传入User对象，这里只能取到userName
		//也就是SimpleAuthenticationInfo构造的时候第一个参数传递需要User对象
//		UserEntity user = (UserEntity)principals.getPrimaryPrincipal();
        /*for(SysRole role:user.getRoleList()){
            authorizationInfo.addRole(role.getRole());
            for(SysPermission p:role.getPermissions()){
                authorizationInfo.addStringPermission(p.getPermission());
            }
        }*/
        return authorizationInfo;
	}
	
	/**
	 * @desc 登录认证
	 * @author zdw
	 * @param token
	 * @return
	 * @throws AuthenticationException
	 * @date 2018年11月9日
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) {
		Object obj = token.getPrincipal();
		String mobile = token.getPrincipal().toString();
		UserEntity user = userService.queryUserByMobile(mobile);
        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(mobile,//认证通过后，存放在session,一般存放user对象
        		user.getPassword(), getName());//返回Realm名
        return authenticationInfo;
	}

}
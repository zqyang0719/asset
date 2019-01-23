package com.ces.erp.sso.base.service.impl;


import com.ces.erp.model.ResultInfo;
import com.ces.erp.sso.base.service.IUserService;
import com.ces.erp.sso.common.repository.JedisClient;
import com.ces.erp.sso.dao.UserDao;
import com.ces.erp.sso.entity.UserEntity;
import com.ces.erp.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    public UserDao userDao;

    @Autowired
    private JedisClient jedisClient;

    @Value("${REDIS_USER_SESSION_KEY}")
    private String REDIS_USER_SESSION_KEY;

    @Value("${SSO_SESSION_EXPIRE}")
    private Integer SSO_SESSION_EXPIRE;

    @Override
    public UserEntity queryUserByMobile(String mobile) {
        return userDao.queryUserByMobile(mobile);
    }

    @Override
    public UserEntity findByUsername(String username) {
        return null;
    }

    @Override
    public ResultInfo queryUserByToken(String token) {
        ResultInfo resultInfo = new ResultInfo();
        // 根据token从redis中查询用户信息
        String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
        // 判断是否为空
        if (StringUtils.isEmpty(json)) {
            return new ResultInfo("400", null,"404","此session已经过期，请重新登录");
        }
        // 更新过期时间
        jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
        // 返回用户信息
        return new ResultInfo("200", JsonUtils.jsonToPojo(json, UserEntity.class),"","");
    }
}

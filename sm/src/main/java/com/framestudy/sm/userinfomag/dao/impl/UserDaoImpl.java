package com.framestudy.sm.userinfomag.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.framestudy.sm.bean.UserBean;
import com.framestudy.sm.userinfomag.dao.IUserDao;
import com.framestudy.sm.userinfomag.mapper.UserMapper;
/**
 * 用户持久层实现类
 * hibernate 框架的实现
 * @author puxubo
 *
 */
@Repository
public class UserDaoImpl implements IUserDao {
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public void saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userMapper.saveUserBean(user);
	}

	@Override
	public void updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userMapper.updateUserBean(user);
	}

	@Override
	public void deleteUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userMapper.deleteUserBean(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.getUserBeanById(id);
	}

}

package com.framestudy.sm.userinfomag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.framestudy.sm.annotation.MyLog;
import com.framestudy.sm.bean.UserBean;
import com.framestudy.sm.enmu.OperateLogEnum;
import com.framestudy.sm.userinfomag.dao.IUserDao;
import com.framestudy.sm.userinfomag.service.IUserService;

/**
 * 用户业务实现类
 * 
 * @author puxubo
 *
 */
@Transactional(readOnly=true)
@Service
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDaoImpl;
	

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@MyLog(menuName="用户管理",operateType=OperateLogEnum.SAVE)
	@Override
	public void saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.saveUserBean(user);
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@MyLog(menuName="用户管理",operateType=OperateLogEnum.UPDATE)
	@Override
	public void updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.updateUserBean(user);
	}
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@MyLog(menuName="用户管理",operateType=OperateLogEnum.DELETE)
	@Override
	public void deleteUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.deleteUserBean(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanById(id);
	}
	
}

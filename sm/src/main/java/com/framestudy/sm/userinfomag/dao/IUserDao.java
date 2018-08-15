package com.framestudy.sm.userinfomag.dao;

import com.framestudy.sm.bean.UserBean;
/**
 * 用户持久层接口
 * @author puxubo
 *
 */
public interface IUserDao {
	/**
	 * 保存用户
	 * @param user
	 */
	void saveUserBean(UserBean user);
	
	/**
	 * 更新用户
	 * @param user
	 */
	void updateUserBean(UserBean user);
	
	/**
	 * 删除用户
	 * @param user
	 */
	void deleteUserBean(UserBean user);
	
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	UserBean getUserBeanById(Long id);
}

package com.framestudy.sm.usermag.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.framestudy.sm.bean.UserBean;
import com.framestudy.sm.userinfomag.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class UserServiceImplTest {

	@Resource
	private IUserService userServiceImpl;
	
	
	@Test
	public void updateUserBean() {
		UserBean user = userServiceImpl.getUserBeanById(1L);
		Assert.assertNotNull(user);
		user.setUserName("黄石公");
		user.setUpdateTime(new Date());
		userServiceImpl.updateUserBean(user);
	}
	
	
	
	@Test
	public void saveUserBean() {
		UserBean user = new UserBean();
		user.setUserName("张良");
		user.setPassword("123456");
		user.setCreateTime(new Date());
		userServiceImpl.saveUserBean(user);
		
	}
	
	
	@Test
	public void getUserBeanById() {
		UserBean user = userServiceImpl.getUserBeanById(1L);
		System.out.println(user);
	}
	
	
	
	
	
}

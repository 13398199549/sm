package com.framestudy.sm.userinfomag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.framestudy.sm.bean.UserBean;

public interface UserMapper {

	/**
	 * 保存用户
	 * @param user
	 */
	@Insert("insert into t_user (user_name,password,create_time) values (#{user.userName},#{user.password},#{user.createTime})")
	@Options(
		useGeneratedKeys=true,
		keyProperty="user.id")
	void saveUserBean(@Param("user")UserBean user);
	
	/**
	 * 更新用户
	 * @param user
	 */
	@Update("update t_user set user_name = #{user.userName},password = #{user.password},update_time = #{user.updateTime} where id = #{user.id}")
	void updateUserBean(@Param("user")UserBean user);
	
	/**
	 * 删除用户
	 * @param user
	 */
	@Delete("delete from t_user where id = #{user.id}")
	void deleteUserBean(@Param("user")UserBean user);
	
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="password",column="password",javaType=String.class)
	})
	@Select("select id,user_name,password from t_user where id = #{id}")
	UserBean getUserBeanById(Long id);
	
	
	
}

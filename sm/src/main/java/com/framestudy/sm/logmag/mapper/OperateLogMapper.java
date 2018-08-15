package com.framestudy.sm.logmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.framestudy.sm.bean.OperateLogBean;

public interface OperateLogMapper {

	@Insert("insert into t_operate_log(user_name,operate_time,menu_name,operate_type,operate_data) values (#{log.userName},#{log.operateTime},#{log.menuName},#{log.operateType},#{log.operateData})")
	@Options(
			useGeneratedKeys=true,
			keyProperty="log.id")
	public void saveOperateLog(@Param("log")OperateLogBean log);
}

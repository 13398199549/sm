package com.framestudy.sm.logmag.dao;

import com.framestudy.sm.bean.OperateLogBean;
/**
 * 操作日志持久层接口
 * @author DELL
 *
 */
public interface IOperateLogDao {
	/**
	 * 保存操作日志
	 * @param log
	 */
	void saveOperateLog(OperateLogBean log);
	
	/**
	 * 操作日志分页方法
	 */
}

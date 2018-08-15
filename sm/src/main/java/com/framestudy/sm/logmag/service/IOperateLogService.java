package com.framestudy.sm.logmag.service;

import com.framestudy.sm.bean.OperateLogBean;
/**
 * 操作日志业务层接口
 * @author puxubo
 *
 */
public interface IOperateLogService {
	/**
	 * 保存操作日志
	 * @param log
	 */
	void saveOperateLog(OperateLogBean log);
	
	/**
	 * 操作日志分页方法
	 */
}

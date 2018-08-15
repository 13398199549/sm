package com.framestudy.sm.logmag.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.framestudy.sm.bean.OperateLogBean;
import com.framestudy.sm.logmag.dao.IOperateLogDao;
import com.framestudy.sm.logmag.mapper.OperateLogMapper;
/**
 * 操作日志持久实现类
 * @author puxubo
 *
 */
@Repository
public class OperateLogDaoImpl implements IOperateLogDao {
	
	@Resource
	private OperateLogMapper operateLogMapper;
	
	@Override
	public void saveOperateLog(OperateLogBean log) {
		// TODO Auto-generated method stub
		operateLogMapper.saveOperateLog(log);
	}

}

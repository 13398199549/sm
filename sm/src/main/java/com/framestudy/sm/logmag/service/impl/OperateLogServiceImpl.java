package com.framestudy.sm.logmag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.framestudy.sm.bean.OperateLogBean;
import com.framestudy.sm.logmag.dao.IOperateLogDao;
import com.framestudy.sm.logmag.service.IOperateLogService;

@Transactional(readOnly=true)
@Service
public class OperateLogServiceImpl implements IOperateLogService {

	@Resource
	private IOperateLogDao operateLogDaoImpl;

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public void saveOperateLog(OperateLogBean log) {
		// TODO Auto-generated method stub
		operateLogDaoImpl.saveOperateLog(log);
	}

}

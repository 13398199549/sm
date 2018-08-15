package com.framestudy.sm.aspect;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.framestudy.sm.annotation.MyLog;
import com.framestudy.sm.bean.OperateLogBean;
import com.framestudy.sm.logmag.service.IOperateLogService;

/**
 * 操作日志切面
 * @author puxubo
 *
 */
@Aspect
@Component
public class OperateLogAspect {

	@Resource
	private IOperateLogService operateLogServiceImpl;
	
	@Pointcut(value="@annotation(com.framestudy.sm.annotation.MyLog)")
	private void pointcut() {}
	
	/**
	 * 后置返回通知
	 * 该通知执行在目标方法正常执行成功之后
	 * @param jp 连接点
	 * @param rev 目标方法的返回结果
	 */
	@AfterReturning(pointcut="pointcut() && @annotation(myLog) ",returning="rev")
	public void afterReturningAdvice(JoinPoint jp,MyLog myLog,Object rev) {
		Object[] args = jp.getArgs();
		//设置操作日志数据
		OperateLogBean log = new OperateLogBean();
		log.setUserName("哈哈");
		log.setOperateTime(new Date());
		log.setMenuName(myLog.menuName());//操作是哪一个模块？
		log.setOperateType(myLog.operateType().getType());//进行的什么操作？
		log.setOperateData(Arrays.toString(args));
		operateLogServiceImpl.saveOperateLog(log);
	}
}

package com.framestudy.sm.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.framestudy.sm.enmu.OperateLogEnum;

/**
 * 操作日志注解
 * 该注解一般定义在业务层的新增，修改，删除的方法上
 * 主要是为了日志切面，提供切入点的切入条件
 * @author puxubo
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyLog {
	/**
	 * menuName 代表模块名称
	 * @return
	 */
	String menuName() default "";

	/**
	 * operateType 代表操作类型
	 * 0-新增，1-修改，2-删除
	 * @return
	 */
	OperateLogEnum operateType();
}

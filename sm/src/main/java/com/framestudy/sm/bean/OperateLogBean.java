package com.framestudy.sm.bean;

import java.io.Serializable;
import java.util.Date;

import com.framestudy.sm.enmu.OperateLogEnum;
/**
 * 操作日志实体类
 * @author puxubo
 *
 */
public class OperateLogBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7577902095498645217L;

	private Long id;
	private String userName;//操作人
	private Date operateTime;//操作时间
	private String menuName;//模块名称
	private int operateType;//操作类型（0新增，1修改，2删除）
	private String operateData;//受到影响的数据（text）
	public OperateLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getOperateType() {
		return operateType;
	}
	public void setOperateType(int operateType) {
		this.operateType = operateType;
	}
	public String getOperateData() {
		return operateData;
	}
	public void setOperateData(String operateData) {
		this.operateData = operateData;
	}
	@Override
	public String toString() {
		return "OperateLogBean [id=" + id + ", userName=" + userName + ", operateTime=" + operateTime + ", menuName="
				+ menuName + ", operateType=" + operateType + ", operateData=" + operateData + "]";
	}
	
	public static void main(String[] args) {
		System.out.println(OperateLogEnum.SAVE);
	}
	
	
}

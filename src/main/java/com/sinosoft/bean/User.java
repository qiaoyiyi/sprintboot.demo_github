package com.sinosoft.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {

	private String name ;
	
	@JsonIgnore//忽略指定的属性，当某个属性不需要显示给前端时
	private String password ;
	
	private Integer age ;
	//按照指定格式，格式化日期类型的属性
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss a",locale="zh",timezone="GMT+8")
	private Date birthday ;
	
	@JsonInclude(Include.NON_NULL)//当这个属性的值为空时，不显示给前端
	private String desc ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}

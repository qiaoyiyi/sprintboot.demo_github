package com.it.qk.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.qk.test.Resource;

@RestController
@RequestMapping("hello")
public class HelloContoller {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello()
	{
		
		return "hello spring boot !!!" ;
	}
	
	@RequestMapping("/time")
	public Object nowDateTime()
	{
		
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()) ;
	}
	
	@RequestMapping("/getResource")
	public Object getResource()
	{
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return  bean;
	}
}

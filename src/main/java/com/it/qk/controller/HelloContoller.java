package com.it.qk.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.it.qk.pojo.User;
import com.it.qk.service.UserMongoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.it.qk.test.Resource;

@RestController
@RequestMapping("hello")
@Slf4j
public class HelloContoller {

	@Autowired
	private Resource resource;

	@javax.annotation.Resource
	private UserMongoService userMongoService;

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

	@RequestMapping("/save/userMongodb")
	public Map<String,Object> saveUser(@RequestBody User user){
		log.info("用户信息|{}",user.toString());
		User saveUser = userMongoService.saveUser(user);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Map<String,Object> maps = new HashMap<>();
		maps.put("User", saveUser);
		maps.put("SimpleDate",sdf.format(new Date()));
		return maps;
	}

	@RequestMapping("/query/getUserMongodb")
	public Map<String,Object> getUser(@RequestParam("username") String username){
		log.info("用户名称|{}",username);
		List<User> userByUsername = userMongoService.getUserByUsername(username);
		Map<String,Object> maps = new HashMap<>();
		maps.put("UserList", userByUsername);
		return maps;
	}


}

package com.sinosoft.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.dao.UserDao;
import com.sinosoft.pojo.DemoJSONResult;
import com.sinosoft.pojo.User;

//@Controller
@RestController //@RestController = @Controller + @ResponseBody
@RequestMapping("user")
public class UserContoller {

	@Autowired
	private UserDao uUserDao ;
	
	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("qiaokai");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("qiaokai");
		u.setuDesc(null);
		
		return u;
	}

	@RequestMapping("/saveUser")
	public DemoJSONResult saveUser()
	{
       SimpleDateFormat sFormat = new SimpleDateFormat("YYYY-MM-DD");
		
		
		User uUser = new User() ;
		uUser.setUserid("0099887653222");
		uUser.setName("乔开");
		uUser.setAge(28);
		uUser.setSex(0);
		try
		{
			uUser.setBirthday(sFormat.parse("1992-11-28"));
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		uUser.setIdcrad("610126199211285653");
		uUser.setPassword("11111111");
		uUser.setMakedate(new Date());
		uUser.setMaketime(new Date());
		
		try
		{
			uUserDao.saveUser(uUser);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return DemoJSONResult.ok("保存成功");
	}
	
	
}

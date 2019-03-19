package com.sinosoft.controller;


import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.bean.User;

//@Controller
@RestController //@RestController = @Controller + @ResponseBody
@RequestMapping("user")
public class UserContoller {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("qiaokai");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("qiaokai");
		u.setDesc(null);
		
		return u;
	}

}

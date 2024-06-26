package com.it.qk.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.it.qk.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("th")
public class ThymeleafController {
	
	@RequestMapping("index")
	public String index(ModelMap map)
	{
		map.addAttribute("name", "qiaokai") ;
		return "thymeleaf/index" ;
	}
	
	@RequestMapping("center")
	public String center()
	{
		return "thymeleaf/center/center" ;
	}
	
	/**
	 * @param map
	 * @return
	 */
	@RequestMapping("test")
	public String test(ModelMap map) {
		User u = new User();
		u.setName("qiaokai");
		u.setAge(16);
		u.setPassword("12345678");
		u.setBirthday(new Date());
		u.setDesc("<font color ='green'><b>hello<b/></font>");
		map.addAttribute("user", u);
		
		User u1 = new User();
		u1.setName("imooc");
		u1.setAge(19);
		u1.setPassword("imooc");
		u1.setBirthday(new Date());
		u1.setDesc("imooc hello world!!!");
		
		User u2 = new User();
		u2.setName("qiaoyiyi");
		u2.setAge(24);
		u2.setPassword("12345678");
		u2.setBirthday(new Date());
		u2.setDesc("hi !!!");
		
		List<User> userList = new ArrayList<User>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		
		map.addAttribute("userList", userList);
		
		return "thymeleaf/test" ;
	}
	
	@RequestMapping("postform")
	public String lform(User user) {
		System.out.println("姓名："+user.getName());
		System.out.println("年龄："+user.getAge());

		return "redirect:/th/test" ;
	}
	
}

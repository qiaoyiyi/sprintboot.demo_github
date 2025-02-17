package com.it.qk.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.it.qk.dto.UserDTO;
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
		UserDTO u = new UserDTO();
		u.setName("qiaokai");
		u.setAge(16);
		u.setPassword("12345678");
		u.setBirthday(new Date());
		u.setDesc("<font color ='green'><b>hello<b/></font>");
		map.addAttribute("user", u);
		
		UserDTO u1 = new UserDTO();
		u1.setName("imooc");
		u1.setAge(19);
		u1.setPassword("imooc");
		u1.setBirthday(new Date());
		u1.setDesc("imooc hello world!!!");
		
		UserDTO u2 = new UserDTO();
		u2.setName("qiaoyiyi");
		u2.setAge(24);
		u2.setPassword("12345678");
		u2.setBirthday(new Date());
		u2.setDesc("hi !!!");
		
		List<UserDTO> userDTOList = new ArrayList<UserDTO>();
		userDTOList.add(u);
		userDTOList.add(u1);
		userDTOList.add(u2);
		
		map.addAttribute("userList", userDTOList);
		
		return "thymeleaf/test" ;
	}
	
	@RequestMapping("postform")
	public String lform(UserDTO userDTO) {
		System.out.println("姓名："+ userDTO.getName());
		System.out.println("年龄："+ userDTO.getAge());

		return "redirect:/th/test" ;
	}
	
}

package com.it.qk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.qk.config.OpenResourceProp;


@Controller
@RequestMapping("ftl")
public class FreemarkerController {

	@Autowired
	private OpenResourceProp openResourceProp;
	
	@RequestMapping("index")
	public String index(ModelMap map)
	{
		map.addAttribute("resource", openResourceProp) ;
		return "freemarker/index" ;
	}
	
	@RequestMapping("center")
	public String center()
	{
		return "freemarker/center/center" ;
	}
	
}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class basic {
	@RequestMapping("/hello")
	@ResponseBody
	public String welcome()
	{
		return"welcome to rest API";
	}

}

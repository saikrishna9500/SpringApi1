package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class basic {
	@RequestMapping("/hi")
	@ResponseBody
	public String welcome()
	{
		return "saikrishna";
	}

}

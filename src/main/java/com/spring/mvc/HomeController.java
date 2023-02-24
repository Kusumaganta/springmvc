package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/overview")
	public String method1() {
		System.out.println("Im inside method1");
		return "home";			
	}
	
	@RequestMapping("/about")
	public String method2() {
		return "aboutus";
	}

}

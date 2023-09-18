package com.prjmini.miniproject137.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping("/")
	public String singin() {
		return "singin";
	}

	@RequestMapping("singin")
	public String main() {
		return "home";
	}

}

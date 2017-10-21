package com.scott.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmailController {
	
	@RequestMapping(method=RequestMethod.GET, value="/Email")
	public String processEmail(){
		return "this is an email";
	}

}

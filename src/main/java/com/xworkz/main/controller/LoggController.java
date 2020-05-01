package com.xworkz.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class LoggController {
	
	
	
	public LoggController() {
System.err.println("created   "  +this.getClass().getSimpleName());	}
	
	@RequestMapping(value="/logg")
	public String loggController()
	{
		
		return "Logg";
	}

}

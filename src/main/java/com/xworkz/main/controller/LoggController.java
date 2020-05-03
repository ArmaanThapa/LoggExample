package com.xworkz.main.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class LoggController {
	
	
	
	private static final Logger looger= Logger.getLogger(LoggController.class);
	
	
	public LoggController() {
		looger.warn("Created   "  +this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/logg")
	public String loggController()
	{
		System.out.println("armaan thapa");
		
		looger.info("logging info example");
		int i=8;
		
		
		try {
			int s=i/0;
			
		} catch (Exception e) {
			looger.error(e.getMessage(),e);
		}
		
		return "Logg";
	}

}

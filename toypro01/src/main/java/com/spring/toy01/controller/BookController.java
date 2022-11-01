package com.spring.toy01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@RequestMapping(value="/book/cal.view")
	public String viewCal() {
		return "/booking/reservation";
	}
}

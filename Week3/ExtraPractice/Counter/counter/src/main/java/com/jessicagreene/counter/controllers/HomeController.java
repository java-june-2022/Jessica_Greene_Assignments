package com.jessicagreene.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class HomeController {
	@RequestMapping("")
	public String welcome(HttpSession session) {
		int currentCount = (int) session.getAttribute("visitCount");
		session.setAttribute("visitCount", currentCount+1);
		return "welcome.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("visitCount") == null) {
			session.setAttribute("visitCount", 0);
		}	
		return "counter.jsp";
	}
}

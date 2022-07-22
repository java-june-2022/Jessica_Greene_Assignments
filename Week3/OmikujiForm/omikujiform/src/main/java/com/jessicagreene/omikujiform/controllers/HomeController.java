package com.jessicagreene.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class HomeController {
	
	//Make a request mapping to render the main page showing the Omikuji form.
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	//Handles processing the information from the form 
	@RequestMapping(value="/process")
	public String process(
						@RequestParam(value="numYears") String numYears,
						@RequestParam(value="city") String city,
						@RequestParam(value="personName") String personName,
						@RequestParam(value="hobby") String hobby,
						@RequestParam(value="livingThing") String livingThing,
						@RequestParam(value="message") String message,
						HttpSession session
						) {
		//store the form input into session
		session.setAttribute("numYears", numYears);
		session.setAttribute("city", city);
		session.setAttribute("personName", personName);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("message", message);
		//redirect to the /omikuji/show route.
		return "redirect:/omikuji/show";
	}
	
	//Make a request mapping for the url /omikuji/show that renders a page with a blue box with a message. 
	//Include an anchor tag that goes back to /omikuji.
	@RequestMapping("/show")
	public String show() {
		return "omikujiShow.jsp";
	}
	
}

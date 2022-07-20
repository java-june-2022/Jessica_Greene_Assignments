package com.jessicagreene.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, 
						@RequestParam(value="lastName", required=false) String lastName,
						@RequestParam(value="times", required=false) Integer times) {
		String greeting;
		
		if(name != null && lastName != null) {
			greeting = String.format("Hello %s %s", name, lastName);
		} else if(name != null){
			greeting =  String.format("Hello %s", name);
		} else {	
			greeting =  "Hello Human";
		}
		
		if(times == null) {
			times = 1;
		}
		
		String output = "";
			
		for(int i=0; i<times; i++) {
			output += greeting + " ";
		}
		return output;	
	}
	
	
}

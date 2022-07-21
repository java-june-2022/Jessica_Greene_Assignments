package com.jessicagreene.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/") 
	public String index(Model model) {
		String name = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 6.25;
		String description = "Metal strips";
		String vendor = "Home Depot";
		
		model.addAttribute("customerName", name);
		model.addAttribute("itemName", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);
		
		return "index.jsp";
	}
}

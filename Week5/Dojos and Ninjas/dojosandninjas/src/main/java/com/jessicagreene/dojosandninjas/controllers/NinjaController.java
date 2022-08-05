package com.jessicagreene.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jessicagreene.dojosandninjas.models.Ninja;
import com.jessicagreene.dojosandninjas.services.DojoService;
import com.jessicagreene.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
		
	@GetMapping("")
	public String dojoIndex() {
		return "redirect:/dojos";
	}
	
	//Create
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.findAllDojos());
		return "new_ninja.jsp";
	}
	@PostMapping("")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result,
								Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", dojoService.findAllDojos());
			return "new_ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	}
}

package com.jessicagreene.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jessicagreene.dojosandninjas.models.Dojo;
import com.jessicagreene.dojosandninjas.services.DojoService;
import com.jessicagreene.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("dojos", dojoService.findAllDojos());
		model.addAttribute("ninjas", ninjaService.findAllNinjas());
		return "index.jsp";
	}
	
	//Create
	@GetMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "new_dojo.jsp";
	}
	@PostMapping("")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, 
							 BindingResult result){
		if(result.hasErrors()) {
			return "new_dojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}
	}
	
	//Read
	@GetMapping("/{id}")
	public String showDojo(@PathVariable("id") Long id, 
							Model model) {
		model.addAttribute("dojo", dojoService.findDojoById(id));
		return "show_dojo.jsp";
	}
	
}

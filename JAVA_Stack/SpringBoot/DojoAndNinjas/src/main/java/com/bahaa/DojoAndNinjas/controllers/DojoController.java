package com.bahaa.DojoAndNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bahaa.DojoAndNinjas.models.Dojo;
import com.bahaa.DojoAndNinjas.models.Ninja;
import com.bahaa.DojoAndNinjas.services.DojoService;
import com.bahaa.DojoAndNinjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String showIndex(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("/add_dojo")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	@GetMapping("/ninja")
	public String showNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos",dojoService.findAll());
		return "NewNinja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "NewNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninja";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String showNinja(@PathVariable Long id, Model model) {
		model.addAttribute("dojo",dojoService.findById(id));
		return "details.jsp";
	}
}

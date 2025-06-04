package com.bahaa.BurgerTracker.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.bahaa.BurgerTracker.mvc.models.Burger;
import com.bahaa.BurgerTracker.mvc.services.BurgerServices;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	@Autowired
	private BurgerServices burgerService;

	@GetMapping("/")
	public String showIndex(@ModelAttribute("burger") Burger burgers, Model model) {
		model.addAttribute("burgers", burgerService.allBurgers());
		return "index.jsp";
	}
	@PostMapping("/burgers")
	public String create(@Valid @ModelAttribute("burgers") Burger burgers, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			burgerService.createBurger(burgers);
			return "redirect:/";
		}
	}

	@GetMapping("/{id}")
	public String editDetails(@PathVariable Long id, Model model) {
		model.addAttribute("burger", burgerService.findById(id));
		return "edit.jsp";
	}

	@PutMapping("/burgers/{id}")
	public String edit(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "edit.jsp";
		} else {
			burgerService.updateBurger(burger);
			return "redirect:/";
		}
	}

}

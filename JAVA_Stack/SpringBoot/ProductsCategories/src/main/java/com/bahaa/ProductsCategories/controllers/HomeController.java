package com.bahaa.ProductsCategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bahaa.ProductsCategories.services.CategoryServices;
import com.bahaa.ProductsCategories.services.ProductServices;

@Controller
public class HomeController {
	
	@Autowired
	private ProductServices productService;
	
	@Autowired
	private CategoryServices categoryService;
	
	
	@GetMapping("/")
	public String Home(Model model) {
		model.addAttribute("categories",categoryService.findAll());
		model.addAttribute("products", productService.findAll());
		return "Home.jsp";
	}
	
	
}

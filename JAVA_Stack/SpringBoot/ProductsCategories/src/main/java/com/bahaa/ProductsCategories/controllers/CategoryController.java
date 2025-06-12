package com.bahaa.ProductsCategories.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bahaa.ProductsCategories.models.Category;
import com.bahaa.ProductsCategories.models.Product;
import com.bahaa.ProductsCategories.services.CategoryServices;
import com.bahaa.ProductsCategories.services.ProductServices;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryServices categoryService;
	
	@Autowired
	private ProductServices productServices;
	
	@GetMapping("/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/add_category")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "home.jsp";
		}else {
			categoryService.createCategory(category);
			return "newCategory.jsp";
		}
	}
	
	@GetMapping("/{id}")
	public String showcategory(@ModelAttribute("category") Category category, Model model, @PathVariable Long id) {
		
		model.addAttribute("category", categoryService.findById(id));
		model.addAttribute("products", productServices.findAllByCategories(category));
		model.addAttribute("restOfProducts", productServices.findByCategoriesNotContains(category));
		return "categoryDetails.jsp";
	}
	
	@PostMapping("/create_relation/{id}")
	public String createRelation(@RequestParam(value = "products") Long product_id, @PathVariable Long id) {
		Product product =productServices.findById(product_id);
		Category category = categoryService.findById(id);
		productServices.addCategoryTProduct(product, category);
		return "redirect:/";

	}

	
	
}

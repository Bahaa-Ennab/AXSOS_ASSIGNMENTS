package com.bahaa.ProductsCategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bahaa.ProductsCategories.models.Category;
import com.bahaa.ProductsCategories.models.Product;
import com.bahaa.ProductsCategories.services.CategoryServices;
import com.bahaa.ProductsCategories.services.ProductServices;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductContrtoller {
	@Autowired
	private ProductServices productService;
	@Autowired
	private CategoryServices categoryService;

	@GetMapping("/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}

	@PostMapping("/add_product")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "home.jsp";
		} else {
			productService.createProduct(product);
			return "newProduct.jsp";
		}
	}

	@GetMapping("/{id}")
	public String showProduct(@ModelAttribute("producttt") Product product, Model model, @PathVariable Long id) {
		
		model.addAttribute("product", productService.findById(id));
		model.addAttribute("categories", categoryService.findAllByProducts(product));
		model.addAttribute("restOfCategories", categoryService.findByProductsNotContains(product));
		return "productDetails.jsp";
	}

	@PostMapping("/create_relation/{id}")
	public String createRelation(@RequestParam(value = "categories") Long categories_id, @PathVariable Long id) {
		Product product =productService.findById(id);
		Category category = categoryService.findById(categories_id);
		productService.addCategoryTProduct(product, category);
		return "redirect:/";

	}

}

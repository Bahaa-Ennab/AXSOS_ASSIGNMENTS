package com.bahaa.ProductsCategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bahaa.ProductsCategories.models.Category;
import com.bahaa.ProductsCategories.models.Product;
import com.bahaa.ProductsCategories.repositories.CategoryRepository;
@Service
public class CategoryServices {
	private final CategoryRepository categoryRepository;

	public CategoryServices(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public Category createCategory(Category c) {
		return categoryRepository.save(c);
	}
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public List<Category> findAllByProducts(Product product){
		return categoryRepository.findAllByProducts(product);
	}
	
	public List<Category> findByProductsNotContains(Product product){
		return categoryRepository.findByProductsNotContains(product);
	}
	
	public Category findById(Long id) {
		Optional<Category> optioanlCategory = categoryRepository.findById(id);
		if(optioanlCategory.isPresent()) {
			return optioanlCategory.get();
			}else {
				return null;
			}
	}
	
	public Category addProductToCategory(Category category,Product product) {
		product.getCategories().add(category);
		categoryRepository.save(category);
		return category;
	}


}

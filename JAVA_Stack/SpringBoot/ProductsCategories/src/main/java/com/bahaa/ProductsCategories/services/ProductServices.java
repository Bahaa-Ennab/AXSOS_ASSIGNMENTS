package com.bahaa.ProductsCategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bahaa.ProductsCategories.models.Category;
import com.bahaa.ProductsCategories.models.Product;
import com.bahaa.ProductsCategories.repositories.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository productRepository;
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> optioanlProduct = productRepository.findById(id);
		if(optioanlProduct.isPresent()) {
			return optioanlProduct.get();
			}else {
				return null;
			}
	}
	
	public List<Product> findAllByCategories(Category category){
		return productRepository.findAllByCategories(category);
	}
	
	public List<Product> findByCategoriesNotContains(Category category){
		return productRepository.findByCategoriesNotContains(category);
	}
	
	public Product addCategoryTProduct(Product product,Category category) {
		category.getProducts().add(product);
		productRepository.save(product);
		return product;
	}
	
}

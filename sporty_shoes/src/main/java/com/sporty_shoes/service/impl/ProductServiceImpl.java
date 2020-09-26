package com.sporty_shoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty_shoes.model.Product;
import com.sporty_shoes.repository.ProductRepository;
import com.sporty_shoes.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository ; 

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product) ; 
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product) ; 
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll() ; 
	}

	@Override
	public Product getProductById(int id) {
		return productRepository.findById(id).get() ; 
	}

	@Override
	public List<Product> getProductByName(String name) {
		return productRepository.findByName(name) ;
	}

	@Override
	public List<Product> getProductByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}

	@Override
	public List<Product> getProductByCategory(int categoryid) {
		return productRepository.findByCategory(categoryid) ; 
	}

	
}
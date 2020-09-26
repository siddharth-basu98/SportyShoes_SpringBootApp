package com.sporty_shoes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty_shoes.model.Category;
import com.sporty_shoes.model.Product;
import com.sporty_shoes.repository.ProductRepository;
import com.sporty_shoes.service.CategoryService;
import com.sporty_shoes.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService ;
	
	@Autowired
	private CategoryService categoryService ; 
	
	@PostMapping("/admin/product/{cat_id}")
	public Product addProduct(@RequestBody Product product, @PathVariable int cat_id) {
		
		Category x = categoryService.getCategoryById(cat_id);
		product.setCategory(x);
		return productService.addProduct(product); 
	}
	
	
	@PutMapping("/admin/product/{cat_id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable int cat_id) {
		
		Category x = categoryService.getCategoryById(cat_id);
		product.setCategory(x);
		return productService.addProduct(product); 
		
	}
	
	
	@DeleteMapping("/admin/product/{prod_id}")
	public void deleteProduct(@PathVariable int prod_id) {
		productService.deleteProduct(prod_id);
	}
	
	
	
	@GetMapping("admin/products")
	public List<Product> getAllProducts(){
		return productService.getAllProduct() ; 
	}
	
	
	@GetMapping("/admin/product/name/{name}")
	public List<Product> getProductByName(@PathVariable String name){
		return productService.getProductByName(name) ; 
	}
	
	
	@GetMapping("/admin/product/brand/{brand}")
	public List<Product> getProductByBrand(@PathVariable String brand){
		return productService.getProductByBrand(brand) ; 
	}

	
	@GetMapping("/admin/product/category/{cid}")
	public List<Product> getProductByCategory(@PathVariable int cid){
		return productService.getProductByCategory(cid) ; 
	}
	
	
}
package com.sporty_shoes.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty_shoes.model.Category;
import com.sporty_shoes.repository.CategoryRepository;
import com.sporty_shoes.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository ; 

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category) ; 
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category) ; 
	}

	@Override
	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll() ; 
	}

	@Override
	public Category getCategoryById(int id) {
		return categoryRepository.findById(id).get() ; 
	}

	@Override
	public List<Category> getCategoriesByName(String name) {
		return categoryRepository.findByName(name) ; 
	}

}

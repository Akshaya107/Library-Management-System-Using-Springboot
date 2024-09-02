package com.project.LibraryMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.LibraryMS.entity.Category;
import com.project.LibraryMS.repo.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	

	public List<Category> getAllCategorys(){
		return categoryRepo.findAll();
	}
	
	public Category getCategoryById(int id) {
		return categoryRepo.findById(id).orElse(null);
	}
	
	public Category saveOrUpdateCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	public void deleteCategoryById(int id) {
		categoryRepo.findById(id).orElse(null);
		
		categoryRepo.deleteById(id);
	}
}

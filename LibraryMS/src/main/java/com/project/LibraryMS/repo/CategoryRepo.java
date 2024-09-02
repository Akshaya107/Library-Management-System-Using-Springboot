package com.project.LibraryMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LibraryMS.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}

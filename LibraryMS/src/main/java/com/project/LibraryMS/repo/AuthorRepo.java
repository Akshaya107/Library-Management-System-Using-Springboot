package com.project.LibraryMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LibraryMS.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer>{

}

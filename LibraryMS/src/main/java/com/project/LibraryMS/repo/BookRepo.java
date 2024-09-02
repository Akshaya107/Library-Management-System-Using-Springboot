package com.project.LibraryMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LibraryMS.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}

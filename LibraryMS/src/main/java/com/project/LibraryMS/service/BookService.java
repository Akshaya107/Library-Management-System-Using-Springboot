package com.project.LibraryMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.LibraryMS.entity.Book;
import com.project.LibraryMS.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	public Book saveOrUpdateBook(Book book) {
		return bookRepo.save(book);
	}
	
	public void deleteBookById(int id) {
		bookRepo.findById(id).orElse(null);
		
		bookRepo.deleteById(id);
	}
	
}

package com.project.LibraryMS.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@ManyToMany
	@JoinTable(name = "books_authors",
	           joinColumns = {@JoinColumn(name = "book_id")},
	           inverseJoinColumns = {@JoinColumn(name = "author_id")})
	private List<Author> authors;
	
	@ManyToMany
	@JoinTable(name = "books_Categories",
    joinColumns = {@JoinColumn(name = "book_id")},
    inverseJoinColumns = {@JoinColumn(name = "Category_id")})
	private List<Category> Categories;
	
	@ManyToMany
	@JoinTable(name = "Publishers_authors",
    joinColumns = {@JoinColumn(name = "book_id")},
    inverseJoinColumns = {@JoinColumn(name = "Publisher_id")})
	private List<Publisher> Publishers;
	
	public Book() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<Category> getCategories() {
		return Categories;
	}

	public void setCategories(List<Category> categories) {
		Categories = categories;
	}

	public List<Publisher> getPublishers() {
		return Publishers;
	}

	public void setPublishers(List<Publisher> publishers) {
		Publishers = publishers;
	}
	
}

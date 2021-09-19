package com.example.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String author;
	private String title;
	private String isbn;
	private int year;	
	private double price;
	
	public Book() {}
	
	public Book(String author, String title, String isbn, int year) {
		super();
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.year = year;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public double setPrice() {
		return price;
	}
	
	public void getPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", isbn=" + isbn + ", year=" + year + "]";
	}
}

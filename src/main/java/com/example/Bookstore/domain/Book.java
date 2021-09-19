package com.example.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	
	@ManyToOne
	@JoinColumn(name = "categoryid")
    private Category category;
	
	public Book() {}
	
	public Book(String author, String title, String isbn, int year, Category category) {
		super();
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.year = year;
		this.category = category;
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
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public double setPrice() {
		return price;
	}
	
	public void getPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		if (this.category != null) {
			return "Book [id=" + id + ", author=" + author + ", title=" + title + ", isbn=" + isbn + ", year=" + year + ", category=" + this.category + "]";
		} else {
			return "Book [id=" + id + ", author=" + author + ", title=" + title + ", isbn=" + isbn + ", year=" + year + "]";
		}
	}
}

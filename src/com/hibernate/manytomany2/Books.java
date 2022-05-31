package com.hibernate.manytomany2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookId;
	private String name;
	private String isbn;
	@ManyToMany(mappedBy = "books",cascade = CascadeType.ALL)
	private List<Author> authors = new ArrayList<>();
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", isbn=" + isbn + ", authors=" + authors + "]";
	}
	
	

}

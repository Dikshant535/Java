package com.qsn3;

import java.util.Objects;

public class Book {
	
	private int bookId ;
	private String bookName;
	private String bookAuthor;
	
	
	
	public Book(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookId, bookName);
	}



	@Override
	public boolean equals(Object obj) {
		Book b = (Book)obj;
		return this.getBookId()==b.getBookId();
	}



	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	
	
}

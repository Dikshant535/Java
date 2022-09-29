package com.qsn1;

public class Book implements Comparable<Book>{
	
	private int bookId ;
	private String bookName;
	private String author ;
	
	
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
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}
	@Override
	public int compareTo(Book b) {
		if(this.getBookId()>b.getBookId()) {
			return 1;
		}else if(this.getBookId()<b.getBookId()) {
			return -1;
		}else{
			return 0;
		}
	}
	
	
	
	
}

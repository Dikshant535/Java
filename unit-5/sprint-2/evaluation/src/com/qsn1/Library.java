package com.qsn1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	public static List<Book> books = new ArrayList<>();
	
	void addBook(Book book)throws BookException{
		int flag = 0;
		if(books.size()==0) {
			
			books.add(book);
			System.out.println("Book added sucessfully !");
			
		}else {
			
			if(books.size()!=0) {
				
				for(Book b : books) {
					flag =0 ;
					if(b.equals(book)) {
						
						BookException be = new BookException(" Book is already exist.");
						throw be;
						
					}else {
						
						flag =1 ;
					}
					
				}
				if(flag ==1) {
					
					books.add(book);
					System.out.println("Book added sucessfully !");
				}
				
			}
		}
		
	}
	
	List viewAllBooks()throws BookException{
		
		if(books.size()==0) {
			
			BookException be = new BookException(" Book List is empty");
			throw be;
		}else {
			
			
			books.sort((s1,s2) -> s1.getBookName().compareTo(s2.getBookName()));
			
			return books;
		}
		
		
		
	}
	
	List viewBooksByAuthor(String author)throws BookException{
		int f =0;
		List<Book> reB = new ArrayList<>();
		
		if(books.size()!=0) {
			
			for(Book bb : books) {
				 f =0;
				 
				if(bb.getAuthor().equals(author)) {
					
					reB.add(bb);
					return reB ;
					
				}else {
					
					f =1 ;
				}
				
			}
			if(f==1) {
				
				BookException be = new BookException("None of the book published by the author Henry");
				throw be;
				
			}
			
		}else {
			
			BookException be = new BookException("List is Empty");
			throw be;
			
		}
		
		
		return reB ;
		
	}
	
	Book getBookByISBN(int isbn)throws BookException{
		int ib =0 ;
		
		if(books.size()!=0) {
			
			for(Book l : books) {
				 ib =0;
				if(l.getIsbn()==isbn) {
					
					return l;
					
				}else {
					ib =1;
				}
				
			}
			if(ib==1) {
				BookException be = new BookException("Book not Found");
				throw be;
			}
			
		}else {
			BookException be = new BookException("List is Empty");
			throw be;
		}
		
		return null;
	}
	
}

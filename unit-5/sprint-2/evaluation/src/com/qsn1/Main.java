package com.qsn1;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Library li = new Library();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.Add Book"+"\n"+"2.Display all book details"+"\n"+ "3.Search Book by author"+"\n"+
					"4.Search book by ISBN"+"\n"+"5.Exit");
			System.out.println("Enter your Choice");
			int ch = sc.nextInt();
			
			if(ch==1) {
				
				System.out.println("Enter the isbn no: ");
				int isbn = sc.nextInt();
				System.out.println("Enter the book name:");
				String name = sc.next();
				System.out.println("Enter the author name: ");
				String aName = sc.next();
				try {
					li.addBook(new Book(isbn, name, aName) );
				}catch (BookException e) {
					
					System.out.println(e.getMessage());
					
				}
				System.out.println("========================");
				
			}else if(ch==2) {
				try {
					
					List<Book> alL = li.viewAllBooks();
					System.out.println("All books are:------");
					for(Book m : alL) {
						System.out.println(m);
					}
					
					
				}catch (BookException e) {
					
					System.out.println(e.getMessage());
				}
				
				System.out.println("========================");
				
			}else if(ch==3) {
				System.out.println("Enter Author name :");
				String aN = sc.next();
				try {
					
					List<Book> vB =  li.viewBooksByAuthor(aN);
					for(Book h : vB) {
						
						System.out.println("ISBN no:"+h.getIsbn());
						System.out.println("Book name: "+h.getBookName());
						System.out.println("Author name: "+h.getAuthor());
						System.out.println("---------------");
						
					}
					
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("========================");
			}else if(ch==4) {
				
				System.out.println("Enter isbn no : ");
				int isbn = sc.nextInt();
				
				try {
					Book b =li.getBookByISBN(isbn);
					System.out.println("ISBN no:"+b.getIsbn());
					System.out.println("Book name: "+b.getBookName());
					System.out.println("Author name: "+b.getAuthor());
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("========================");
			}else if(ch==5) {
				
				break;
			}
			
			
		}
		
	
		
		
	}
	
	
}

package com.qsn4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Library {
	
	public static List<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book) {

		bookList.add(book);
		System.out.println("Book added successfully");
		System.out.println("========================================");
		
	}
	
	public boolean isEmpty() {
		
		return (bookList.size()==0);
		
	}
	
	public List<Book>viewAllBooks(){
		
		return null ;
	}
	
	public List<Book>viewBooksByAuthor(String author){
		
		for(Book b:bookList) {
			String aut = b.getAuthor();
			if(aut.equals(author)) {
				
				return bookList;
			}
		}
		return null ;
		
		
	}
	
	public int countNoOfBook(String bookName) {
		
		
		return 0;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		
		while(true) {
			System.out.println("1. Add Book"+"\n"+"2. Display all book details"+"\n"+"3. Search Book by Author"+"\n"+"4. Count number of books - by book name"+"\n"+"5.Exit");
			System.out.println();
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.println("Enter the isbn no: ");
				int isbn = sc.nextInt();
				System.out.println("Enter the book name: ");
				String bookName = sc.next();
				System.out.println("Enter the author name: ");
				String author = sc.next();
				System.out.println("========================================");
				library.addBook(new Book(isbn,bookName,author));
				
			}else if(choice==2) {
				
				boolean check = library.isEmpty();
				if(check) {
					
					System.out.println("List is empty");
					
				}else {
					
					for(Book i:bookList) {
						
						System.out.println("========================================");
						System.out.println("Book isbn No: "+i.getIsbn());
						System.out.println("Book Name: "+i.getBookName());
						System.out.println("Book Author Name: "+i.getAuthor());
						
					}
					
					System.out.println("==========================================");
					
				}	
			}else if(choice==5) {
				
				System.out.println("Thankyou..!");
				break ;
				
			}else if(choice==3) {
				System.out.println("Enter the Author name : ");
				String author = sc.next() ;
				List<Book> bookList = library.viewBooksByAuthor(author) ;
				if(bookList!=null) {
					
					for(Book n:bookList) {
						System.out.println("Book isbn no. is: "+n.getIsbn());
						System.out.println("Book Name is: "+n.getBookName());
						System.out.println("Book Author is: "+n.getAuthor());
						System.out.println("==========================================");
					}
					
				}else
					System.out.println("None of the book published by the author "+author);
				
				
			}else if(choice==4) {
				
				
			}
		}
		
		
	}
	
}

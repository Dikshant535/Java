package com.qsn3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Library {
	
	Set<Book> books = new LinkedHashSet();
	
	Set<Member> members = new TreeSet<>(new MemCompDate());
	
	public void addBook(Book book) {
		int flag = 0;
		if(books.size()==0) {
			
			books.add(book);
			System.out.println("Book added sucessfully....!");
			
		}else if(books.size()!=0){
			
			for(Book i:books) {
				flag = 0 ;
				if(i.equals(book)) {
					
					System.out.println("Duplicate Entry...!");
				
					
				}else {
					
					flag=1;
					
				}
				
			}
			
			if(flag==1) {
				
				books.add(book);
				System.out.println("Book added sucessfully....!");
				
			}
			
			
		}
		
	}
	
	public void addMember(Member member) {
		int flag = 0;
		if(members.size()==0) {
			
			members.add(member);
			System.out.println("Member added sucessfullyy......");
			
		}else if(members.size()!=0) {
			
			for(Member j:members) {
				flag =0;
				if(j.equals(member)) {
					
					System.out.println("Duplicate Member");
					
				}else {
					
					flag =1 ;
					
				}
				
			}
			if(flag==1) {
				
				members.add(member);
				System.out.println("Member added sucessfullyy......");
				
			}
			
		}
		
	}
	
	public void printBook() {
		
		for(Book i:books) {
			
			System.out.println(i);
		}
		
	}
	
	public void printMember() {
		
		for(Member g:members) {
			
			System.out.println(g);
			
		}
		
		
	}
	
}

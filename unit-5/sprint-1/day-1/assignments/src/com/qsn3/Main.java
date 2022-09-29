package com.qsn3;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Library li = new Library();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of books you wants to enter..");
		int n = sc.nextInt();
		int i = 0;
		while(i<n) {
			
			System.out.println("Enter the book Id");
			int id  = sc.nextInt();
			
			System.out.println("Enter the book name");
			String name = sc.next();
			
			System.out.println("Enter the author name");
			String sname = sc.next();
			
			Book b = new Book(id, name, sname);
			
			li.addBook(b);
			i++;
			
		}
		
		li.printBook();
		
		
		
		System.out.println("Enter the number of members you wants to add");
		int k = sc.nextInt();
		
		int j = 0;
		
		while(j<k) {
			
			System.out.println("Enter the member id");
			int idm   = sc.nextInt();
			
			System.out.println("Enter the member name");
			String mnam = sc.next();
			
			System.out.println("Enter the membership number");
			int mno = sc.nextInt();
			
			System.out.println("Enter the member end date in the format dd-MM-yyyy");
			String mdate = sc.next();
			
			LocalDate date = LocalDate.parse(mdate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			li.addMember(new Member(idm, mnam, mno, date));
			j++;
		}
		
		li.printMember();
		
	}
	

	
	
}

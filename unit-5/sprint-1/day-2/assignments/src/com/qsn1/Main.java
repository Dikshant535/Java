package com.qsn1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static List<? extends Person>  add(List<? extends Person> std) {
		
		return std ;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> stds = new ArrayList();
		List<Emploee> empls = new ArrayList();
		
		System.out.println("How many Student you wants to add....");
		int ns = sc.nextInt();
		int i =0 ;
		
		while(i<ns) {
			
			System.out.println("Enter Student Id..");
			int ids = sc.nextInt();
			
			System.out.println("Enter Student name..");
			String nas = sc.next();
			
			System.out.println("Enter Student name..");
			int ms = sc.nextInt();
			
			stds.add(new Student(ids, nas, ms));
			i++;
		}
		
		System.out.println("How many Employee you wants to add....");
		int es = sc.nextInt();
		int j =0 ;
		
		while(j<es) {
			
			System.out.println("Enter Employee Id..");
			int eds = sc.nextInt();
			
			System.out.println("Enter Employee name..");
			String nae = sc.next();
			
			
			empls.add(new Emploee(eds, nae));
			j++;
			
		}
		
		List<? extends Person> st = add(stds);
		List<? extends Person> el = add(empls);
		
		for(Person l:st) {
			
			System.out.println(l);
		}
		
		for(Person k:el) {
			
			System.out.println(k);
		}
		
		
	}
	
	
}

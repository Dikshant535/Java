package com.qsn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Product> products = new TreeSet<>() ;
		
		for(int i=0;i<4;i++){
			
			System.out.println("Enter Details of product "+(i+1));
			
			System.out.println("Enter productID :");
			int productId = sc.nextInt() ;
			System.out.println("Enter product name: ");
			String productName = sc.next() ;
			System.out.println("Enter product price: ");
			double productPrice = sc.nextDouble() ;
			
			
			Product p = new Product(productId, productName, productPrice);
			products.add(p);
			
		}
	
		System.out.println("1. Sort ProductPrice"+"\n"+"2. Sort ProductName"+"\n"+"3. Sort ProductId");
		int choice = sc.nextInt() ;
		if(choice==1) {
			
			List<Product> pp = new ArrayList<>(products);
			
			Collections.sort(pp,new Productprice());
			System.out.println(pp);
			
		}else if(choice==2) {
			

			List<Product> pp = new ArrayList<>(products);
			Collections.sort(pp,new Productname());
			System.out.println(pp);
			
		}else if(choice==3) {
			
			List<Product> pp = new ArrayList<>(products);
			Collections.sort(pp,new Productid());
			System.out.println(pp);
			
		}else {
			
			List<Product> pp = new ArrayList<>(products);
			Collections.sort(pp,new Productid());
			System.out.println(pp);
			
		}
		
		
	}

}

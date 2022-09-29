package com.qsn2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Queue<Product> products = new PriorityQueue<>(new ProCompPrice());
		
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		
		
		while(true) {
			
			System.out.println("Enter the Products Details : ");
			System.out.println("=================================");
			System.out.println("You want add Product enter y/n");
			String choice = sc.next();
			
			if(choice.equals("y")){
				
				System.out.println("Enter Product Id :");
				int id = sc.nextInt();
				
				System.out.println("Enter Product name :");
				String nm = sc.next();
				
				System.out.println("Enter Product price :");
				int pr = sc.nextInt();
				
				products.offer(new Product(id, nm, pr));
				
			}else {
				
				System.out.println("1. Show Details of Product.."+"\n"+"2. You want exit ");
				int c = sc.nextInt();
				if(c==1) {
					
					List<Product> p = new ArrayList(products);
					Collections.sort(p,new ProCompPrice() );
					Iterator<Product> itr = p.iterator();
				
				
					while((itr.hasNext())!=false){
						
						Product pq = itr.next();
						System.out.println(pq);
						
					}
					flag=1;
					break;
					
				}else {
					flag=1;
					break;
				}
				
			}
			if(flag==1) {
				break;
			}
		}
		
		
	}

}

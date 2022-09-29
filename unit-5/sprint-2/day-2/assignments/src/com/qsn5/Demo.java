package com.qsn5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "maggie", 1, 15));
		products.add(new Product(2, "amlaTail", 1, 65));
		products.add(new Product(3, "Huggies", 1, 30));
		products.add(new Product(4, "pen", 1, 10));
		products.add(new Product(5, "eraser", 1, 7));
		
		Collections.sort(products, (s1,s2) -> s1.getPrice()>s2.getPrice()? 1:-1);
		
		for(Product p : products) {
			
			System.out.println(p);
			
		}
		
	}
	
	
}

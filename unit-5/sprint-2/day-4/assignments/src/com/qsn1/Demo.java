package com.qsn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "maggie", 15, 12));
		products.add(new Product(2, "Amla tail", 65, 15));
		products.add(new Product(3, "Pen", 10, 8));
		products.add(new Product(4, "Pencile", 5, 9));
		products.add(new Product(5, "Hugies", 40, 20));
		
		List<Product> list = products.stream().filter(s -> s.getQuantity()>10).collect(Collectors.toList());
		
		Collections.sort(list,(p1,p2) -> p1.getPrice()>p2.getPrice() ? 1:-1);
		
		System.out.println("Original List.....");
		System.out.println();
		products.forEach(s -> System.out.println(s));
		System.out.println();
		System.out.println("================================================================================");
		
		System.out.println("Filtered List.....");
		System.out.println();
		list.forEach(s -> System.out.println(s));
		System.out.println();
		
	}
	
	
}

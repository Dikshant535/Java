package com.qsn4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ecommerce {
	
	public List<Product> productList=new ArrayList<>();
	
	public void addProduct(Product product) {
//		HashSet<Product> products = new HashSet<>();
		int flag = 0 ;
//		System.out.println(productList.size());
		if(productList.size()==0) {
			productList.add(product);
			System.out.println("Product added successfully");
		}else {
			for(Product p:productList) {
				 flag = 0 ;
//				System.out.println(p.hashCode());
//				System.out.println(product.hashCode());
				if(p.equals(product)) {
//					System.out.println("inside");
					int total = p.getCount()+product.getCount();
					p.setCount(total);
					System.out.println("Count updated Product already exists");
					break;
				}
				else {
					flag=1;
				}	
			}
			
		}
		if(flag==1) {
			productList.add(product);
			System.out.println("Product added successfully");
		}
		
		
	}
	
	public List<Product> showAllProducts(){
		
		
		return productList ;
	}
}

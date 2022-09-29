package com.qsn1;

import java.util.Comparator;

public class Productid implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		if(p1.getProductID()>p2.getProductID()) {
			return 1;
		}else if(p1.getProductID()<p2.getProductID()) {
			return -1;
		}else
			return 0;
		
	}
	
	

}

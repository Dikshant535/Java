package com.qsn1;

public class Product implements Comparable<Product>{
	
	private int productID ;
	private String productName;
	private double productPrice ;
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	public Product(int productID, String productName, double productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public int compareTo(Product o) {
		
		if(this.getProductID()>o.getProductID()) {
			return 1;
		}else if(this.getProductID()<o.getProductID()) {
			return -1;
		}else
			return 0;
	}
	
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
//	
	
	
	
	
	
}

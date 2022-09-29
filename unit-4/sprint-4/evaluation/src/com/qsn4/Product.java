package com.qsn4;

import java.util.Objects;

public class Product {
	
	private String name ;
	private double price ;
	private String company ;
	private int count ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]";
	}
	
	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product p= (Product)obj;
		return (this.getCompany().equals(p.getCompany())&&this.getName().equals(p.getName())&&this.getPrice()==p.getPrice());
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(price,name,company);
		
	}
}

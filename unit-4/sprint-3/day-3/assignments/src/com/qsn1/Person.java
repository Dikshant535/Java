package com.qsn1;

public class Person {
	
	
	private String name;
	private String gender;
	private Address address;
	
	Person(){
		Address a = new Address();
		this.address = a;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Address getA() {
		return address;
	}
	public void setA(Address a) {
		this.address = a;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}

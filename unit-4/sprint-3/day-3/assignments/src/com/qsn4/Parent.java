package com.qsn4;

public class Parent {
	
	public void method1() {
		
		System.out.println("Inside method1 from Parent");
		
		System.out.println("Number is :-"+x);
		
	}
	
	void method2() {
		
		System.out.println("Inside method2 from Parent");
		
	}
	
	void method3() {
		
		System.out.println("Inside method3 from Parent");
		
	}
	
	final int x;

	public Parent(int x) {
		super();
		this.x = x;
	}
	
	
	
}

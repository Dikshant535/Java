package com.qsn1;

public class A {
	
	
	static synchronized void funA( B b1) {
		System.out.println("funA start");
		b1.fun2();
		
		System.out.println("funA ends");
	}
	
	static synchronized void fun1() {
		
		System.out.println("Inside a function fun2 of A");
	}

}

package com.qsn1;

public class B {
	
	static synchronized void funA( A a1) {
		System.out.println("funA start");
		a1.fun1();
		
		System.out.println("funA ends");
	}
	
	static synchronized void fun2() {
		
		System.out.println("Inside a function fun2 of A");
	}

	
}

package com.qsn1;

public interface X {
	
	public void fun1();
	public default void fun2() {
		
		System.out.println("Inside fun2() default from X");
		
	}
	public static void fun3() {
		
		System.out.println("Inside Fun3() static Fron X");
		
	}
	
	
}

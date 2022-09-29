package com.qsn1;

public interface Y {
	
	
	public void fun4();
	
	public default void fun5() {
		
		System.out.println("inside fun5 default from Y");
		
	}
	
	public static void fun6() {
		
		System.out.println("Inside static fun6 from Y");
		
	}
	
}

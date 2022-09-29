package com.qsn4;

public  class Child extends Parent {

	public Child(int x) {
		super(x);
	}
	
	@Override
	public void method1() {
		
		System.out.println("Inside method1 from Child");
		super.method1();
	}
	
	@Override
	void method2() {
		
		System.out.println("Inside method2 from Child");
		
	}
	
	void method4() {
		
		System.out.println("Inside method4 from child");
		
	}
	

	
}

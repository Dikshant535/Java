package com.qsn2;

public class Demo {
	Demo(){
		this("rama");
		System.out.println("This is a Demo() constructor");
	}

	Demo(String s){
		this(10);
		System.out.println("This is a Demo(String s) constructor");
	}

	Demo(int i){
		this(20.2f);
		System.out.println("This is a Demo(int i) constructor");
	}

	Demo(float f){
		System.out.println("This is a Demo(float f) constructor");
	}
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
	}
}

package com.qsn4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number.....");
		
		int y = sc.nextInt();
		
		if(y<=10&y>0) {
			
			Parent p = new Child(y);
			p.method1();
			p.method2();
			p.method3();
			
			Child c = (Child)p;
			c.method4();
			
			
		}else {
			System.out.println("Invalid Number......");
		}
		
	}

}

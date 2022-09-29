package com.qsn4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Test t = new Test();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number......");
		int num = sc.nextInt();
		
		int[] arr = t.display(num);
		
		for(int a:arr) {
			if(a!=0) {
				System.out.print(a+" ");
			}
			
		}
		
	}

}

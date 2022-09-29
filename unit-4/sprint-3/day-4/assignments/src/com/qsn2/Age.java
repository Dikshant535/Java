package com.qsn2;

import java.util.Scanner;

public class Age {
	
	public static int calculateAverage(int[] age) {
		int sum = 0;
		for(int i=0;i<age.length;i++) {
			sum+=age[i];
		}
		
		return sum/age.length;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no.of employees...");
		int num = sc.nextInt();
		if(num>=2) {
			
			int[] age = new int[num];
			System.out.println("Enter Employee age...");
			for(int i=0;i<age.length;i++) {
				System.out.println("Enter age of Employee "+(i+1));
				int n = sc.nextInt();
				age[i] = n;
			}
			
			double res = calculateAverage(age);
			
			System.out.println("The average age is "+res);
		}else {
			System.out.println("Please enter a valid employee count.......");
		}
		
	}

}

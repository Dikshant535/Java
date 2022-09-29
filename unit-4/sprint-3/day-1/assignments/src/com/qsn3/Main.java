package com.qsn3;

import java.util.Scanner;

public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] ar) {
		int[] arr  = new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			int c = ar[i];
			int count = 0;
			for(int j=1;j<=c;j++) {
				if(c%j==0) {
					count++;
				}
			}
			if(count==2) {
				arr[i]=c;
			}
		}
		/*for(int a:arr) {
			System.out.print(a+" ");
		}*/
		//System.out.println();
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Main m = new Main();
		System.out.println("Enter the Lenght od Array......");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element of index "+i);
			int val = sc.nextInt();
			arr[i] = val;
		}
		
		int[] ar = m.findAndReturnPrimeNumbers(arr);
		//m.findAndReturnPrimeNumbers(arr);
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}

}

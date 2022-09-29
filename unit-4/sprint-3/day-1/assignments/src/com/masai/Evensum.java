package com.masai;

import java.util.Scanner;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of 2d array : ");
		int row = sc.nextInt();
		System.out.println("Enter the col of 2d ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter the value of "+i+" "+j);;
				int value = sc.nextInt();
				arr[i][j] = value;
			}
		}
		/*for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		for(int i=0;i<col;i++) {
			int total = 0;
			for(int j=0;j<row;j++) {
				if(arr[j][i]%2==0) {
					total+=arr[j][i];
				}
			}
			System.out.println(total);
		}
	}

}

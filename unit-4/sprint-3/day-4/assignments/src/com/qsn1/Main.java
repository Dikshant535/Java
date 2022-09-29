package com.qsn1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of passenger.....");
		int numberOfPassenger = sc.nextInt();
		
		System.out.println("Enter Number of Kms.....");
		int numberOfKms = sc.nextInt();
		
		Ola myOla = new Ola();
		
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		
		int res = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is: "+ res);
		
	}

}

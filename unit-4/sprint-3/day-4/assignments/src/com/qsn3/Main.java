package com.qsn3;

public class Main {

	public static void main(String[] args) {

		Area a = new Area();
		int ca = a.circleArea(5);
		System.out.println("Area of Circle is "+ca);
		System.out.println();
		int ra = a.rectangleArea(10, 20);
		System.out.println("Area of Recangle is "+ra);
		System.out.println();
		int sa = a.squareArea(10);
		System.out.println("Area of Square is "+sa);
		
	}

}

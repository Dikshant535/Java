package com.qsn3;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		
		int ra = 2*(length+breadth);
		return ra;
	}

	@Override
	public int squareArea(int side) {
		
		int sa = side*side;
		return sa;
	}

	@Override
	public int circleArea(int radius) {
		
		int ca = (22*radius*radius)/7;
		
		return ca;
	}

}

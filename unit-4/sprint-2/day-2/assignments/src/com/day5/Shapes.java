package com.day5;

public class Shapes {
	 public void area(Circle circle) {
		 Circle c = new Circle();
		 System.out.println("Area of circle is  : "+c.radius*c.radius);
	 }
     public void area(Rectangle rectangle) {
    	 Rectangle r = new Rectangle();
    	 System.out.println("Area of rectangle is  : "+r.lenght*r.breadth);
    	 
     }
     public void area(Square square) {
    	 Square sq = new Square();
    	 System.out.println("Area of square is  : "+sq.side*sq.side);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s = new Shapes();
		s.area(new Circle());
		s.area(new Square());
		s.area(new Rectangle());
		
	}

}

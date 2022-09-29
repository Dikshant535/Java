package com.qsn4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.setModel("Maruti800");
		c1.setCompanyName("Maruti Sux-zuki");
		c1.setColor("RED");
		Engine e1 = c1.getEngine();
		e1.setRpm(800);
		e1.setPower(1500);
		e1.setManufacturer("maruti");
		e1.makeTurbo();
		
		System.out.println("car mode :"+c1.getModel());
		System.out.println("car company :"+c1.getCompanyName());
		System.out.println("car color :"+c1.getColor());
		System.out.println("car RPM : "+e1.getRpm());
		System.out.println("car power :"+e1.getPower());
		System.out.println("car engine manufacture :"+e1.getManufacturer());
		System.out.println("turbo : " +e1.getHasTurbo());
		
		Engine E1=new Engine(9000,101,"maruti",false);
		Car c2=new Car("swift desire","Maruti","white",E1);
		
		System.out.println("car mode :"+c2.getModel());
		System.out.println("car company :"+c2.getCompanyName());
		System.out.println("car color :"+c2.getColor());
		System.out.println("car RPM : "+E1.getRpm());
		System.out.println("car power :"+E1.getPower());
		System.out.println("car engine manufacture :"+E1.getManufacturer());
		System.out.println("turbo : " +E1.getHasTurbo());
	}

}

package com.qsn1;

public class Ola {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			Car c = new HatchBack();
			c.setNumberOfKms(numberOfKMs);
			c.setNumberOfPassenger(numberOfPassenger);
			return c ;
		}else {
			Car c = new Sedan();
			c.setNumberOfKms(numberOfKMs);
			c.setNumberOfPassenger(numberOfPassenger);
			return c ;
		}
		
	}
	
	public int calculateBill(Car car) {
		
		if(car instanceof HatchBack) {
			HatchBack h=(HatchBack)car;
			int Totalfare = car.getNumberOfKms()*h.getFarePerKm();
			return Totalfare;
		}else {
			Sedan h=(Sedan)car;
			int Totalfare = car.getNumberOfKms()*h.getFarePerKm();
			return Totalfare;
		}
		
	}
	
}

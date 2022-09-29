package com.qsn2;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount>1000) {
			
			return new TajHotel();
			
		}else if(amount>200&&amount<1000) {
			
			return new RoadSideHotel();
			
		}else {
			
			return null;
			
		}
		
		
	}
	
	public static void main(String[] args) {

		Demo d = new Demo();
		
		Hotel h =d.provideFood(1100);
		
		if(h==null) {
			
			System.out.println("Enter Amount greater than 200......");
			
		}else {
			
			if(h instanceof TajHotel ) {
				
				TajHotel t = (TajHotel)h;
				
				t.chickenBiryani();
				t.masalaDosa();
				t.welcomeDrink();
				
			}else {
				
				RoadSideHotel r = (RoadSideHotel)h;
				
				r.chickenBiryani();
				r.masalaDosa();
				
			}
			
		}
		
	}

}

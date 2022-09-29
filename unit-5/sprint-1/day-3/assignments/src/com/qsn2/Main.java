package com.qsn2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter your DOB in formate of dd/MM/yyyy...");
			String dob = sc.next();
			
			LocalDate dobl = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			LocalDate date = LocalDate.now();
			
			Period diff = Period.between(date, dobl);
			
			if(diff.getYears()<=0) {
				System.out.println();
				System.out.println("Date should not be in Future..");
			}else {
				
				System.out.println("Age of user id : "+diff.getYears());
				System.out.println();
				
			}
				
			
			
		}catch (DateTimeParseException dtpE) {
			
			
			System.out.println("Please enter the date in correct format”");
			
		}
		
		
	}
	
}

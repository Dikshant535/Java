package com.qsn6;

import java.util.Scanner;

public class Main {
	
	public static double getStudent(int choice) {
		Scanner s = new Scanner(System.in);
		if(choice==1) {
			
			System.out.println("Enter the Marks for Hindi:");
			int hindiMarks = s.nextInt();
			System.out.println("Enter the Marks for English:");
			int englishMarks = s.nextInt();
			System.out.println("Enter the Marks for History:");
			int historyMarks = s.nextInt();
			Student a = new ArtStudent(hindiMarks,englishMarks,historyMarks);
			double per = a.findPercentage();
			return per;
			
		}else if (choice==2) {
			
			System.out.println("Enter the Marks for Physics:");
			int physicsMarks = s.nextInt();
			System.out.println("Enter the Marks for Chemistry:");
			int chemistryMarks = s.nextInt();
			System.out.println("Enter the Marks for Math:");
			int mathsMarks = s.nextInt();
			System.out.println("Enter the Marks for Biology:");
			int biologyMarks = s.nextInt();
			
			Student ss = new ScienceStudent(physicsMarks,chemistryMarks,mathsMarks,biologyMarks);
			double per = ss.findPercentage();
			return per;
			
			
		}else if(choice==3) {
			
			System.out.println("Enter the Marks for Account:");
			int accountMarks = s.nextInt();
			System.out.println("Enter the Marks for Economics:");
			int economicsMarks = s.nextInt();
			System.out.println("Enter the Marks for Buisness:");
			int businessStudiesMarks = s.nextInt();
			Student a = new ArtStudent(accountMarks,economicsMarks,businessStudiesMarks);
			double per = a.findPercentage();
			return per;
		}else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Student percentage do you want to find: "+"\n"+"1. ArtStudent "+"\n"+"2. ScienceStudent "+"\n"+"3. CommerceStudent");
		
		int choice = sc.nextInt();
		
		Main m = new Main();
		double ans = m.getStudent(choice);
		if(ans==0) {
			System.out.println("Enter under option value.....");
		}else {
			System.out.println("Percentage is: "+ans);
		}
		
		
		
	}

}

package com.qsn3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket t1 = new Ticket();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of bookings:");
		int no = sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		int avavailabletk = sc.nextInt();
		
		Ticket.setAvailableTickets(avavailabletk);
		
		int i =1;
		while(i<=no) {
			
			System.out.println("Enter the ticketid:");
			int ticketid = sc.nextInt();
			System.out.println("Enter the price:");
			int price = sc.nextInt();
			System.out.println("Enter the no of tickets:");
			int noOfTickets = sc.nextInt();
			
			t1.setPrice(price);
			t1.setTicketid(ticketid);
			
			System.out.println("Availabe Tickets:"+Ticket.getAvailableTickets());
			
			int totalAmt = t1.calculateTicketCost(noOfTickets);
			
			System.out.println("Total amount:"+totalAmt);
			System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
			
			i++;
			
		}
		
	}

}

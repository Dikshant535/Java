package com.qsn3;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;
	
	
	
	public int getTicketid() {
		return ticketid;
	}



	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public static int getAvailableTickets() {
		return availableTickets;
	}



	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}

	public static void setAvailablityTickets(int availableTickets) {
		if(availableTickets<0) {
			System.out.println("Tickets are nor available");
		}else {
			Ticket.availableTickets = availableTickets;
		}
	}
	
	public static int  getAvailablityTickets() {
		return availableTickets;
	}
	
	
	public int calculateTicketCost(int noOfTickets) {
		if(noOfTickets<=getAvailablityTickets()) {
			setAvailablityTickets((getAvailablityTickets()-noOfTickets));
			return noOfTickets*getPrice();
		}else {
			return -1;
		}
	}
	
	
	
	
}

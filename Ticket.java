package activity;

class Ticket 
{
		int ticketNumber;
	    String passengerName;
	    String destination;
	    double price;
	    Ticket(int ticketNumber, String passengerName, String destination, double price) {
	        this.ticketNumber = ticketNumber;
	        this.passengerName = passengerName;
	        this.destination = destination;
	        this.price = price;
	    }
	    int getTicketNumber() {
	        return ticketNumber;
	    }

	    String getPassengerName() {
	        return passengerName;
	    }

	    String getDestination() {
	        return destination;
	    }

	    double getPrice() {
	        return price;
	    }
	    void setTicketNumber(int ticketNumber) {
	        this.ticketNumber = ticketNumber;
	    }

	    void setPassengerName(String passengerName) {
	        this.passengerName = passengerName;
	    }

	    void setDestination(String destination) {
	        this.destination = destination;
	    }

	    void setPrice(double price) {
	        this.price = price;
	    }
	    void printTicketDetails() {
	        System.out.println("Ticket Number: " + ticketNumber);
	        System.out.println("Passenger Name: " + passengerName);
	        System.out.println("Destination: " + destination);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {
	        Ticket ticket = new Ticket(123456, "John Doe", "New York", 250.0);
	        ticket.printTicketDetails();
	    }
	}



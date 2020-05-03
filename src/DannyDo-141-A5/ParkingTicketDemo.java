/*
 * Danny Do
 * CS141
 * Assignment 5
 * 06/01/18
 */

public class ParkingTicketDemo {

	public static void main(String[] args) {
		//Case1
		System.out.println("\n... set minutes purchased to 60, and");
		System.out.println("\tparked for 125 minutes...");
	
		ParkedCar car = new ParkedCar("Volkswagen", "2002", "Red", "3RHZ147",125);
		ParkingMeter meter = new ParkingMeter(60);
		PoliceOfficer officer= new PoliceOfficer("Joe Friday", "4788");
		ParkingTicket ticket = officer.patrol(car,meter);
		
		if(ticket != null) {
			System.out.println(ticket);
		}
		else
			System.out.println("No crimes committed!");
		
		//Case 2
		System.out.println("\n...change minutes parked to 60...");
		car.setMinutesParked(60);
		//ParkedCar car1 = new ParkedCar("Volkswagen", "2002", "Red", "3RHZ147",60);
		ParkingTicket ticket1 = officer.patrol(car,meter);
		
		if(ticket1 != null) {
			System.out.println(ticket1);
		}
		else
			System.out.println("No crimes committed!");	
		
		//case 3
		System.out.println("\n...change minutes parked to 61...");
		car.setMinutesParked(61);
		//ParkedCar car2 = new ParkedCar("Volkswagen", "2002", "Red", "3RHZ147",61);
		ParkingTicket ticket2 = officer.patrol(car,meter);
		
		if(ticket2!=null) {
			System.out.println(ticket2);
		}
		else
			System.out.println("No crimes committed!");
		
		//case 4
		System.out.println("\n...change car model to 2010...");
		car.setModel("2010");
		//ParkedCar car3 = new ParkedCar("Volkswagen", "2010", "Red", "3RHZ147",61);
		ParkingTicket ticket3 = officer.patrol(car,meter);
		
		if(ticket3!=null) {
			System.out.println(ticket3);
		}
		else
			System.out.println("No crimes committed!");
		
		System.out.println("\n...change minutes purchased to 70...");
		meter.setMinutesPurchased(70);
		ParkingTicket Ticket4 = officer.patrol(car, meter);
		
		if(Ticket4!=null) {
			System.out.println(Ticket4);
		}
		else
			System.out.println("No crimes committed!");
		
		
		
		
		
		
		
		
	}

}

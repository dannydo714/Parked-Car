/*
 * Danny Do
 * CS141
 * Assignment 5
 * 06/01/18
 */

public class PoliceOfficer extends ParkingTicket{
	String name;
	String badgeNumber;
	
	//constructor
	public PoliceOfficer(String n, String bn) {
		name = n;
		badgeNumber = bn;	
	}
	
	public PoliceOfficer(PoliceOfficer officer2) {
		name= officer2.getName();
		badgeNumber= officer2.getBadgeNumber();
		}
	
	public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
		ParkingTicket ticket = null;
		int minutesPassed = car.getMinutesParked() - meter.getMinutesPurchased();
		
		if(minutesPassed>0) {
			ticket= new ParkingTicket(car, this, minutesPassed);
		}
		return ticket;
	}
	//@Override
	public String toString() {
		return "\nOfficer Data:" +"\nName: " + name + "\nBadgeNumber: "+ badgeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBadgeNumber() {
		return badgeNumber;
	}
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	

}

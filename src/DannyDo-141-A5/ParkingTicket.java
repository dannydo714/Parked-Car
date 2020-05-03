/*
 * Danny Do
 * CS141
 * Assignment 5
 * 06/01/18
 */
public class ParkingTicket {
	
	ParkedCar car;
	PoliceOfficer officer;
	int minutes;
	double fine;
	final double BASE_FINE = 35.0;
	final double HOURLY_FINE = 10.0;
	
	public ParkingTicket() {
		
	}
	public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min) {
		car = new ParkedCar(aCar);
		officer = new PoliceOfficer(anOfficer);
		minutes = min;
		
		calculateFine();
	}
	public ParkingTicket(ParkingTicket ticket2) {
		car = new ParkedCar(ticket2.car);
		officer= new PoliceOfficer(ticket2.officer);
		fine = ticket2.fine;
		 
		calculateFine();
	}
	public void calculateFine() {
		int tempMins = this.getMinutes();
		fine =BASE_FINE;
		if(tempMins>60) {
			tempMins-=60;
			fine+=HOURLY_FINE;
		}
	}
		
	public String toString() {
		return car.toString() + "\n"+ officer.toString() + "\n"+"\nMinutes Illegally Parked: "+minutes+ "\nFine: $" + fine;
	
	}
	
	//Setters and getters
	public ParkedCar getCar() {
		return car;
	}
	public void setCar(ParkedCar car) {
		this.car = car;
	}
	public PoliceOfficer getOfficer() {
		return officer;
	}
	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
}


/*
 * Danny Do
 * CS141
 * Assignment 5
 * 06/01/18
 */

public class ParkedCar extends ParkingTicket{
	String make;
	String model;
	String color;
	String licenseNumber;
	int minutesParked;
	
	//constructor 
	public ParkedCar(String mk, String mod, String col,String lic, int min){
		make = mk;
		model = mod;
		color= col;
		licenseNumber = lic;
		minutesParked = min;
	}
	//@Override
	public String toString() {
		return "Car Data:"+ "\nMake: "+ make + "\nModel: "+ model+ "\nColor: "+ color+ "\nLicense Number: "+ licenseNumber+ "\nMinutes Parked: "+ minutesParked;   
		}

	public ParkedCar(ParkedCar car2) {
		this.make = car2.getMake();
		this.model = car2.getModel();
		this.color = car2.getColor();
		this.licenseNumber = car2.getLicenseNumber();
		this.minutesParked= car2.getMinutesParked();
	}

	//setters and getters 
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public int getMinutesParked() {
		return minutesParked;
	}

	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}
	
}

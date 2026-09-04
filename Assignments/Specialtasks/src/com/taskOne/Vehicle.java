package com.taskOne;
public class Vehicle {
	
	String ownerName;
	String vehicleNumber;
	String vehicleType;
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	
	public void vehicleDetails() {
		System.out.println("Owner Name : "+ownerName);
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("Vehicle Type : "+vehicleType);
		
	}

}

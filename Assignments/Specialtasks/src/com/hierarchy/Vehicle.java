package com.hierarchy;

public class Vehicle {
	String make;
	String model;
	int year;
	
	public Vehicle(String make, String model, int year) {
	
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void displayInfo() {
		System.out.print(make+" ");
		System.out.print(model+" ");
		System.out.print(year+" \n");
	}
	

}

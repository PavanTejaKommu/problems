package com.hierarchy;

import java.util.Scanner;

public class Car extends Vehicle {
	
int noOfDoors;
		
	public void displayCarInfo() {
		displayInfo();
		System.out.println("No Of Doors : "+noOfDoors);
	}
	
	public Car(String make, String model, int year, int noOfDoors) {
		super(make, model, year);
		this.noOfDoors = noOfDoors;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Make : ");
		String make = sc.nextLine();
		
		System.out.println("Enter Model : ");
		String model = sc.nextLine();
		
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter how many Doors : ");
		int doors = sc.nextInt();
		sc.nextLine();
		
		
		Vehicle car = new Car(make, model, year, doors);
		
		
		((Car) car).displayCarInfo();

	}


}

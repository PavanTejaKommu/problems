package com.hierarchy;

import java.util.Scanner;

public class Truck  extends Vehicle{
	
	long carGoCapacity;
	
	public void displaytruckInfo() {
		displayInfo();
		System.out.println("cargo capacity : "+carGoCapacity);
	}
	
	
	
public Truck(String make, String model, int year, long carGoCapacity) {
		super(make, model, year);
		this.carGoCapacity = carGoCapacity;
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
		
		System.out.println("Enter Crago Capacity : ");
		long capacity = sc.nextLong();
		sc.nextLine();
		
		Vehicle truck = new Truck(make, model, year, capacity);
		//truck.displayInfo();
		
		((Truck) truck).displaytruckInfo();
		
		
		
	}

}

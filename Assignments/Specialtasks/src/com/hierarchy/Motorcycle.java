package com.hierarchy;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
	String hasSideCar;

	public Motorcycle(String make, String model, int year, String hasSideCar) {
		super(make, model, year);
		this.hasSideCar = hasSideCar;
	}


	public void displayMotorcycleInfo() {
		displayInfo();
		System.out.println("Motor Cycle has sider : "+hasSideCar);
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

		System.out.println("Enter Motor Cycle side car : ");
		String hasside = sc.nextLine();


		Vehicle motorcycle = new Motorcycle(make, model, year, hasside);
		(	(Motorcycle) motorcycle).displayMotorcycleInfo();





	}

}

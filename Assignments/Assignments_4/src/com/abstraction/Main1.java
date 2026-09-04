package com.abstraction;

import java.util.Scanner;

abstract class  vehicle {


	abstract void startEngine();
	abstract void fuelType();
	abstract void modelName ();
	abstract void vehilecname ();
	abstract void company();
	abstract void display();	
	String modelname;
	String vehicleName;
	String company;
	public vehicle(String modelname, String vehicleName, String copany) {
		super();
		this.modelname = modelname;
		this.vehicleName = vehicleName;
		this.company = company;
	}

}


class Car extends vehicle{


	private	int noOfDoors;
	private	boolean hasSunroof;
	public Car(String modelname, String vehicleName, String company, int noOfDoors, boolean hasSunroof) {
		super(modelname, vehicleName, company);
		this.noOfDoors = noOfDoors;
		this.hasSunroof = hasSunroof;
		System.out.println("****Car****");
	}
	@Override
	void startEngine() {
		System.out.println("Starting engine with key ignition");

	}
	@Override
	void fuelType() {
		System.out.println("Fueal Type  Petrol");

	}
	@Override
	void modelName() {


		System.out.println("Model Name : "+modelname);
	}
	@Override
	void vehilecname() {

		System.out.println("Vehicle Name : "+vehicleName);

	}
	@Override
	void company() {
		System.out.println("Vehicle Company : "+company);		
	}
	@Override
	void display() {
		System.out.println("NO of Doors : "+noOfDoors);
		System.out.println("Has SunRoof : "+hasSunroof);
	}


}

class Bike extends vehicle{
	private	boolean hasSideCar;

	public Bike(String modelname, String vehicleName, String copany, boolean hasSideCar) {
		super(modelname, vehicleName, copany);
		this.hasSideCar = hasSideCar;
		System.out.println("****Bike****");
	}

	@Override
	void startEngine() {
		System.out.println("Starting engine with kick-start");		
	}

	@Override
	void fuelType() {
		System.out.println("Feuel Type : Petrol");		
	}

	@Override
	void modelName() {
		System.out.println("Model Name : "+modelname);		
	}

	@Override
	void vehilecname() {
		System.out.println("Vehicle Name : "+vehicleName);		
	}

	@Override
	void company() {
		System.out.println("Company : "+company);		
	}
	void display() {
		System.out.println("Has Side Car : "+hasSideCar);
	}




}


class Truck extends vehicle{

	private	double cargoCapacity;

	public Truck(String modelname, String vehicleName, String copany, double cargoCapacity) {
		super(modelname, vehicleName, copany);
		this.cargoCapacity = cargoCapacity;
		System.out.println("****Truck****");
	}

	@Override
	void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up...");

	}

	@Override
	void fuelType() {
		System.out.println("Fuel type : diesel");		
	}

	@Override
	void modelName() {
		System.out.println("Model Name : "+modelname);		
	}

	@Override
	void vehilecname() {
		System.out.println("Vehicle Name : "+vehicleName);		
	}

	@Override
	void company() {
		System.out.println("Company : "+company);		
	}

	void display() {
		System.out.println("Crago capacity : "+cargoCapacity);
	}



}

public class Main1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose The Vehicle \nCar\nBike\nTruck");

		String choice = sc.nextLine();
		choice.trim();
		String str = choice.toLowerCase();

		switch (str) {
		case "car": {

			vehicle v1 = new Car("Toyota Camry", "ABC123", "Toyota", 4, true);

			v1.startEngine();
			v1.company();
			v1.modelName();
			v1.fuelType();
			v1.display();


			break;
		}
		case "bike":{

			vehicle v2 = new  Bike("Yamaha R1", "XYZ789", "Yamaha", false);
			v2.startEngine();
			v2.company();
			v2.modelName();
			v2.fuelType();
			v2.display();

			break;
		}
		case "truck":{

			vehicle v3 = new  Truck("Volvo FH", "DEF456", "Volvo", 20000);
			v3.startEngine();
			v3.company();
			v3.modelName();
			v3.fuelType();
			v3.display();
			break;
		}
		default:
			System.err.println("***Invalid input***");
		}
		sc.close();

	}

}

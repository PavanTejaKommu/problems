package com.overriding;

import java.util.Scanner;

class Cab {

	void calculateFare(double distance) {

		System.out.println("Car distance : "+distance);

	}
	void calculateWaitingCharge(int minutes) {
		System.out.println("Calculation charge : "+minutes);

	}
	void startRide() {
		System.out.println("Ride started ...");

	}
	void endRide() {
		System.out.println("Ride ended ...");

	}


}


class MiniCab extends Cab{


	void calculateFare(double distance) {

		System.out.println("Car distance  overriden method : "+distance);

	}
	void calculateWaitingCharge(int minutes) {
		System.out.println("Calculation charge overriden method  : "+minutes);

	}
	void startRide() {
		System.out.println("Ride started overriden method  ...");

	}
	void endRide() {
		System.out.println("Ride ended  overriden method ...");

	}

}
class SedanCab extends Cab{
	void calculateFare(double distance) {

		System.out.println("Car distance  overriden method  : "+distance);

	}
	void calculateWaitingCharge(int minutes) {
		System.out.println("Calculation charge overriden method  : "+minutes);

	}
	void startRide() {
		System.out.println("Ride started overriden method  ...");

	}
	void endRide() {
		System.out.println("Ride ended overriden method  ...");

	}

}
class LuxuryCab extends Cab{
	void calculateFare(double distance) {

		System.out.println("Car distance overriden method  : "+distance);

	}
	void calculateWaitingCharge(int minutes) {
		System.out.println("Calculation charge  overriden method : "+minutes);

	}
	void startRide() {
		System.out.println("Ride started overriden method ...");

	}
	void endRide() {
		System.out.println("Ride ended overriden method ...");

	}

}



public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the Distence : ");
		int distance = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter time in min  : ");
		int time= sc.nextInt();
		sc.nextLine();

		System.out.println("Select Cab type \n1.MiniCab\r\n"
				+ "2.SedanCab\r\n"
				+ "3.LuxuryCab\r\n"
				+ "");
		Cab c1 = new MiniCab();
		Cab c2 = new SedanCab();
		Cab c3 = new LuxuryCab();

		int choice = sc.nextInt();
		sc.nextLine();

		if(choice == 1) {

			c1.calculateFare(distance);
			c1.calculateWaitingCharge(time);
			c1.startRide();
			c1.endRide();
		}else if(choice ==2) {

			c2.calculateFare(distance);
			c2.calculateWaitingCharge(time);
			c2.startRide();
			c2.endRide();


		}else if(choice == 3) {
			c3.calculateFare(distance);
			c3.calculateWaitingCharge(time);
			c3.startRide();
			c3.endRide();

		}else {
			System.out.println("Invalid input entered ");
		}



	}

}

package com.methods.and.gitHub;

import java.util.Scanner;

public class ElectricityBill {

	static int  unitsConsumed ;
	static int  costPerUnit ;
	static int	totalBill ;

	public void unitDetails() {
		System.out.println("**** Electricty Bill ****");
		System.out.println("Units Consumed :"+unitsConsumed);
		System.out.println("Cost Per Unit :"+costPerUnit
				);

	}

	public static void calculateBill() {
		totalBill = unitsConsumed*costPerUnit;
		System.out.println("Total Bill :"+totalBill);

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		unitsConsumed = sc.nextInt();
		costPerUnit =sc.nextInt();

		ElectricityBill eb = new ElectricityBill();
		eb.unitDetails();
		calculateBill();


	}

}

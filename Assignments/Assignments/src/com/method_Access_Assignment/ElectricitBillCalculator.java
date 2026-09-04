package com.method_Access_Assignment;

import java.util.Scanner;

public class ElectricitBillCalculator {


	static  int units;
	static int  costPerUnit = 8;
	static float total_bill ;	

	public static void calculateBill() {


		total_bill = units * costPerUnit;
		System.out.println(total_bill);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println(" Units ");
		units= sc.nextInt();


		System.out.println("Cost Per Unit ");
		costPerUnit= sc.nextInt();

		System.out.println(" Total Bill ");
		calculateBill();




	}

}

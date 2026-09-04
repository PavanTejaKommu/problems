package com.conditionalstatementsswitchcase;
import java.util.Scanner;
public class ElectricityBillCalculator {
	int perUnit;

	public void calculation(int bill) {
		if(bill>=200) {
			perUnit = 5;
			System.out.println("Total Bill : "+(bill*perUnit));


		}else if(bill <= 200 && bill>=101) {
			perUnit =3;
			System.out.println("Total Bill : "+(bill*perUnit));

		}else if(bill<=100) {

			perUnit = 2;
			System.out.println("Total Bill : "+(bill*perUnit));


		}else {
			System.out.println("Invalid");
		}

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Units Consumed : ");

		ElectricityBillCalculator obj = new ElectricityBillCalculator();

		obj.calculation(sc.nextInt());

	}

}

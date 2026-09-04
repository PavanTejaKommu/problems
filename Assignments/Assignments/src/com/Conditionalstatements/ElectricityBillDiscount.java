package com.Conditionalstatements;

import java.util.Scanner;

public class ElectricityBillDiscount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the current bill : ");

		int currentBill = sc.nextInt();
		int discount_amount = 0;


		System.out.println("Original Bill : "+currentBill);

		if(currentBill > 5000) {
			discount_amount = (currentBill * 20)/100;

			System.out.println("Discount : "+discount_amount);


		}
		System.out.println("Final bill : "+ (currentBill -  discount_amount));

	}

}

package com.problemsolving;

public class Student {

	public static void main(String[] args) {

		/*
		 * take two variables register , attendance 
		 * take if with the condition register = true and attandance >=80
		 * print eligible for exam 
		 * otherwise :
		 * print not eligible for exam 
		 * 
		 */
		boolean isRegistered = true;
		int attandance = 80;

		if(isRegistered && attandance >= 80) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not eligibel ");
		}



		boolean isRestaruntOpen =  true;
		boolean deliveryLocation = true;
		if(isRestaruntOpen && deliveryLocation) {
			System.out.println("Order Delivery is available");
		}else {
			System.out.println("Not Available ");
		}


		






	}

}

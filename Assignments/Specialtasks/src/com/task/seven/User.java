package com.task.seven;

import java.util.Scanner;

public class User extends SubscriptionPlan {
	
	
	

	public User(String subscriberName, String subscriberType, int cost, int paidAmount, String subscriptionStatus) {
		super(subscriberName, subscriberType, cost, paidAmount, subscriptionStatus);
	}

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Subscriber Name : ");
	 String subscriberName = sc.nextLine();
	 
	 System.out.println("Enter Subscription Type : ");
	 String subscriberType = sc .nextLine();
	 System.out.println("Enter cost : ");
	 int cost = sc.nextInt();
	 sc.nextLine();
	 System.out.println("Enter Paid Amount : ");
	 int paidAmount = sc.nextInt();
	 sc.nextLine();
	 
	 System.out.println("Enter Subscription Status : ");
	 
	 String subscriptionStatus = sc.nextLine();
	 
	 
	 User us = new User(subscriberName, subscriberType, cost, paidAmount, subscriptionStatus);
	
	
	
	int choice =0;
	boolean run = true;
	
	do {
		System.out.println("--- Menu ---\r\n"
				+ "1. Update Payment\r\n"
				+ "2. Change Status\r\n"
				+ "3. View Summary\r\n"
				+ "4. Exit\r\n"
				+ "");
		
		
		System.out.println("Enter Choice : ");
		choice = sc.nextInt();
	switch (choice) {
	case 1: {
		System.out.println("Enter amount : ");
		int amount = sc.nextInt();
		sc.nextLine();
		us.updatePayment(amount);
		break;
	}
	case 2:{
		System.out.println("Enter Status : ");
		String update = sc.nextLine();
		us.changeStatus(update);
		break;
	}
	case 3:{
		us.viewSummary();
		break;
	}
	case 4:{
		System.out.println("Exit");
		run = false;
		break;
	}
	default:
	
System.err.println("Invalid Input ");
		break;
		
	}
	}while(run);

	}

}

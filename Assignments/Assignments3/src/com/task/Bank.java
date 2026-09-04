package com.task;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter customer Name :  ");
		String customerName  = sc.nextLine();

		System.out.println("Enter customer Adress : ");
		String customerAdress = sc.nextLine();


		System.out.println("Enter customer Number : ");
		long customerNumber = sc.nextLong();

		System.out.println("Enter Balanec : ");
		double balance  = sc.nextDouble();

		BankApplication ba = new 
				BankApplication(customerName, customerAdress, customerNumber, balance);

		int decision ;
		do {
		System.out.println("**** Select an Option from Below ****"); 
		System.out.println("1. Withdraw "); 
		System.out.println("2. Deposit");  
		System.out.println("3. Show Balance "); 
		System.out.println("4. Exit \n"); 

		 decision = sc.nextInt();

		if(decision ==1) {
			System.out.println("Enter the amount to withdrawl : ");
			int withdrawl = sc.nextInt();
			ba.withdraw(withdrawl);
		}else if(decision == 2) {
			System.out.println("Enter amount to deposit : ");
			int amount = sc.nextInt();
			ba.deposit(amount);

		}else if(decision == 3) {
			ba.showBalance();
		}else if(decision == 4) {
			System.out.println("Exit");
			break;
		}else {
			System.err.println("Invalid nput ");
		}
		}while(decision !=4 );

	}

}

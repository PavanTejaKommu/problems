package com.time.pass;

import java.util.Scanner;

import com.task.BankApplication;

public class Usingswitch {

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

			switch(decision) {



			case 1 : {
				System.out.println("Enter the amount to withdrawl : ");
				int withdrawl = sc.nextInt();
				ba.withdraw(withdrawl);
				break;
			}
			case 2 :{
				System.out.println("Enter amount to deposit : ");
				int amount = sc.nextInt();
				ba.deposit(amount);
				break;
			}
			case 3: {
				ba.showBalance();
				break;
			}
			case 4: {
				System.out.println("Exit");
				break;
			}
			default : {
				System.err.println("Invalid nput ");
				break;
			}
			}
		}while(decision !=4 );


		}
	
}







package com.student;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		BankAccount bc = new BankAccount();
		
		
		System.out.println("Enter account holder Name : ");
		bc.setAccountHolderName(sc.nextLine());
		
		System.out.println("Enter account Number : ");
		bc.setAccountNumber(sc.nextInt());
		
		System.out.println("Enter account balance : ");
		bc.setBalance(sc.nextDouble());
		
		System.out.println("Bank Account Details ");
		System.out.println("-------------------------------");
		
		System.out.println("Acoount Holder Name : "+bc.getAccountHolderName());
		System.out.println("Account Number : "+bc.getAccountNumber());
	System.out.println("Account Balance : "+bc.getBalance());
	}

}

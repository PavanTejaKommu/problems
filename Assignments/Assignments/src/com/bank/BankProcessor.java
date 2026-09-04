package com.bank;

import java.util.Scanner;

public class BankProcessor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number : ");
		int account = sc.nextInt();
		System.out.println("Enter holder name : ");
		String holder = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter acoount balnce : ");
		double balanec = sc.nextDouble();
		
		
		
		
		
		BankAccount ba = new BankAccount(account, holder, balanec);
		sc.nextLine();
		System.out.println("----------------------------------------------");
		System.out.println("Enter deposit amount : ");
		int amount = sc.nextInt();
		ba.deposit(amount);
		System.out.println("Enter the amount to withdrawl : ");
		int with_am = sc.nextInt();
		ba.withdraw(with_am);
		
		
		
	}

}

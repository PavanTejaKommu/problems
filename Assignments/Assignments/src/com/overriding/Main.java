package com.overriding;

public class Main {
	public static void main(String[] args) {
		
		Bankaccount b = new SavingaAccount();
		b.deposit();
		b.withdrawl();
		b.CalculateIntrest();
		b.displayAccountDetails();
		
		
		System.out.println("----------------------------------");
		
		
		
		Bankaccount b1 = new CurrentAccount();
		b1.deposit();
		b1.withdrawl();
		b1.CalculateIntrest();
		b1.displayAccountDetails();
		
		System.out.println("-----------------------------------------------");
		
		
		
		Bankaccount b2 = new SalaryAccount();
		b2.deposit();
		b2.withdrawl();
		b2.CalculateIntrest();
		b2.displayAccountDetails();
		
		
	}

}

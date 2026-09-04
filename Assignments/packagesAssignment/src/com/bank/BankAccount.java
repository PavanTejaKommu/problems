package com.bank;

public class BankAccount {

	public String bankName = "SBI";
	private double balance = 3000;
	protected String branchName = "HYD";
	 int accountNumber = 12345;


	public int balance(int  balance ) {
		return balance;
	}
	public void displayDetails() {
	
		System.out.println(   "Bank Name      : "   +bankName);
		System.out.println(   "Balnace        : "+balance);
		System.out.println(   "Branch Name    : "  +branchName);
		System.out.println(   "Account Number : " +accountNumber);

	}

}

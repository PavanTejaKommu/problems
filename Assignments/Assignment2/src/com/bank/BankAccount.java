package com.bank;

public class BankAccount {
	
	private int  accountNumber ;
	
	private String holderName ;
	
	private double balance ;
	
	
	public BankAccount(int accountNumber , String holdername , double balnace) {

	this.accountNumber = accountNumber;
	this.holderName = holdername;
	this.balance = balnace;
	System.out.println("Details added succesfully ");
	
	}


	
	// getters 
	public int getAccountNumber() {
		return accountNumber;
	}




	public String getHolderName() {
		return holderName;
	}




	public double getBalance() {
		return balance;
	}
	
	
	// setters 

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	public void deposit(double amount) {
		balance = amount + balance;
		System.out.println("Amount added succesfully  current balance : "+balance);
		
	}
	
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawl succesfull current balance : "+balance);
		}
		
	}
	
	

}

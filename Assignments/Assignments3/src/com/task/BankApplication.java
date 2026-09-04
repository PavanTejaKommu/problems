package com.task;

public class BankApplication {
	
	String customerName ;
	String customerAdress;
	long customerNumber;
	double balance ;
	
	
	
	public BankApplication(String customerName , String cutomerAdress , long customerNumber,
			double balance) {
		
		this.customerName =  customerName;
		this.customerAdress = customerAdress;
		this.customerNumber = customerNumber;
		this.balance = balance;
		
		System.out.println("*** Account Created Succesfully ***\n");
		
	}
	
	
	public void deposit(double amount) {
		if(amount > 0) 
		{
		balance = balance + amount;
		System.out.println("Deposit succesfull Current Balance "+balance+"\n");
		}else {
			System.err.println("Please enter the valid amount "+"\n");
		}
	}
	
	
	public void withdraw(double amount) {
		if(amount < balance && amount >0 ) {
			balance = balance - amount;
			System.out.println("Withdrawl Successfull current balance :"+balance +"\n");
		}
		
		else if(amount > balance){
			System.err.println("Insufficent funds "+"\n");
			
		}else if (amount <=0) {
			System.err.println("Please enter the amount above 0 "+"\n");
			
		}else{
			System.err.println("Please enter the valid input "+"\n");
		}
	}
	
	
	public void showBalance() {
		System.out.println("Current Balance : "+balance);
	}
	
}
	



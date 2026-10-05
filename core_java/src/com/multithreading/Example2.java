package com.multithreading;

public class Example2 {
	
private	double balance = 5000;
	
	synchronized void  withdrawl(double amount) {
		if(amount > balance) {
			System.out.println("Insufficent Funds");
			
		}else {
		this.balance= balance - amount;
		
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Updated balance : "+balance);
		}
		
	}
	
	
	synchronized void  deposit(double amount) {
		this.balance = balance + amount;
		System.out.println(Thread.currentThread().getName());
		System.out.println("Updated balance : "+balance);
		
	}

}

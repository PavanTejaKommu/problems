package com.overriding;

public class SavingaAccount  extends Bankaccount {
	@Override
public void deposit() {
		
		System.out.println("Bank deposit Savings Account .. Overriden method");
		
	}
	@Override
	public void withdrawl() {
		System.out.println("Bank Withdrawl  Savings Account...Overriden method");
		
	}
	@Override
	public void CalculateIntrest() {
		System.out.println("Calculate Intrest Bank  Savings Account ...Overriden method");
		
	}
	@Override
	public void displayAccountDetails() {
		
		System.out.println("Display details Bank   Savings Account..Overriden method");
		
	}

}

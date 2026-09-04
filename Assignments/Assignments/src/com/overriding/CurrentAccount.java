package com.overriding;

public class CurrentAccount extends Bankaccount {
	@Override
public void deposit() {
		
		System.out.println("Bank deposit  Current Account ..Overriden method");
		
	}
	@Override
	public void withdrawl() {
		System.out.println("Bank Withdrawl   Current Account ...Overriden method");
		
	}
	
	@Override
	
	public void CalculateIntrest() {
		System.out.println("Calculate Intrest Bank  Current Account  ...Overriden method");
		
	}
	@Override
	public void displayAccountDetails() {
		
		System.out.println("Display details Bank   Current Account ..Overriden method");
		
	}

}

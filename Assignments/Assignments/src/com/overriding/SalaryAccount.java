package com.overriding;

public class SalaryAccount  extends Bankaccount{
	@Override
public void deposit() {
		
		System.out.println("Bank deposit Salary Account ..Overriden method");
		
	}
	@Override
	public void withdrawl() {
		System.out.println("Bank Withdrawl  Salary Account  ...Overriden method");
		
	}
	@Override
	public void CalculateIntrest() {
		System.out.println("Calculate Intrest Bank  Salary Account ...Overriden method");
		
	}
	@Override
	public void displayAccountDetails() {
		
		System.out.println("Display details Bank Salary Account  ..Overriden method");
		
	}

}


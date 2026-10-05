package com.exceptionhandling;

import java.util.Scanner;

public class Program5 {

	private double amount;
	private double withdrawlAmount;
	private double balance =0;

	public Program5(double amount, double withdrawlAmount) {
		
		this.amount = amount;
		this.withdrawlAmount = withdrawlAmount;

	}

	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getWithdrawlAmount() {
		return withdrawlAmount;
	}


	public void setWithdrawl(double withdrawlAmount) {
		this.withdrawlAmount = withdrawlAmount;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	private void withdrawl ()  throws Exception{



		try {

			if(getWithdrawlAmount() > getAmount()) {
				int num = 2/0;
			}else if (getWithdrawlAmount() == 0) {
				String str = null;
				System.out.println(str.charAt(0));
			}


		} catch (ArithmeticException ae) {
			System.out.println("You entered the amout avove then your balance ");


		}catch (NullPointerException ne) {
			System.out.println("Enter the value above 0 ");


		}
		
//		finally {
//			System.out.println("Exception occured and handled ");
//			
//		}

		 setBalance(getAmount() - getWithdrawlAmount());

		System.out.println("Transaction succesfull");
		System.out.println("Current balance : "+getBalance());


	}

	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount : ");
		
		double amount = sc.nextDouble();

		System.out.println("Enter Withdraw amount : ");
		
		double withdraw = sc.nextDouble();

		Program5 obj = new Program5(amount , withdraw);
		
		
		System.out.println(obj.getAmount());
		System.out.println(obj.getWithdrawlAmount());
		System.out.println(obj.getBalance());
		

		obj.withdrawl();


		sc.close();

	}

}

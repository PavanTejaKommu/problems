package com.looping.statements;

import java.util.Scanner;


public class ATM_Menu {
	Scanner sc = new Scanner(System.in);
	int currentBalance ;
	int choice;

	public void show() {
		System.out.println("******** ATM MENU ********");
		System.out.println("Check Balance  : 1 "); 
		System.out.println("Deposit Money  : 2 ");
		System.out.println("Withdraw Money : 3 ");
		System.out.println("Exit :  4 ");
		System.out.println("Eneter your choice : ");
		choice = sc.nextInt();

	}

	public void checkBalance() {
		System.out.println("Current Balance : "+currentBalance);

	}

	public void depositMoney(int deposit) {

		currentBalance = currentBalance + deposit;
		System.out.println("Deposit successs ");

		System.out.println("Current Balance : "+currentBalance);

	}


	public void withdrawMoney(int withdrawl) {
		currentBalance = currentBalance- withdrawl;

		System.out.println("Transaction succesful");
		System.out.println("Current Balance : "+currentBalance);

	}

	public void exit() {


		System.out.println("Current Balance : "+currentBalance);

	}


	public void display() {

		show();
		if(choice ==1 ) {
			checkBalance();

		}else if(choice == 2) {
			System.out.println("Enter the amount to deposit");
			depositMoney(sc.nextInt());

		}else if(choice == 3) {
			System.out.println("Enter the amount to withdrawl");
			withdrawMoney(sc.nextInt());

		}else if(choice ==4) {
			System.out.println("Thank You for Using Our ATM!");
			exit();
		}

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ATM_Menu at = new ATM_Menu();
		System.out.println("Enter the intial balance : ");

		at.currentBalance = sc.nextInt();
		at.display();

	}

}

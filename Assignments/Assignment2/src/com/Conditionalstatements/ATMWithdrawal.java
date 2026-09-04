package com.Conditionalstatements;

import java.util.Scanner;

public class ATMWithdrawal {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Balance : ");
		int amount = sc.nextInt();

		System.out.println("Enter the withdrawl amount : ");
		int withdrawl = sc.nextInt();

		if(withdrawl > amount) {
			System.out.println("Insufficient balance ");
		}else {

			System.out.println("Transaction succesful Balance Amount : "+(amount - withdrawl));	
		}

	}

}

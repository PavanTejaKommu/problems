package com.task.two;

import java.awt.Choice;
import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name : ");
		String customerNamem = sc.nextLine();
		System.out.println("Enter Policy Type : ");
		String policyType = sc.nextLine();
		System.out.println("Enter Policy Mount : ");
		double policyAmount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Approved Amount : ");
		double approvedAmount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Policy status : ");
		String policyStatus = sc.nextLine();


		InsurancePolicy ip = new InsurancePolicy(customerNamem, policyType);

		InsurancePolicy ip2 = new InsurancePolicy(customerNamem, policyType, policyAmount);

		InsurancePolicy ip3 = new InsurancePolicy(customerNamem, policyType, policyAmount, approvedAmount, policyStatus);


		int choice;


		boolean limit = true;

		do {
			System.out.println("1.Update Approved Amount\r\n"
					+ "2.Change Policy Status\r\n"
					+ "3.View Policy Summary\r\n"
					+ "4.Exit the program\r\n"
					);

			System.out.println("Enter Choice : ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {

				System.out.println("Enter Updated approved Amount :");
				double amount = sc.nextInt();
				sc.nextLine();
				ip3.updateApprovedAmount(amount);
				break;
			}
			case 2:{
				System.out.println("Enter Updated Policy Status : ");
				String updated = sc.nextLine();
				ip3.changePolicyStatus(updated);
				break;

			}
			case 3:{

				ip3.ViewPolicySummary();

				break;
			}
			case 4:{
				System.out.println("Exit");
				limit = false;
				break;

			}
			default:
				System.err.println("Inavlid Input ");
			}
		}while(limit);

	}

}

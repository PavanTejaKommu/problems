package com.taskOne;

import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter owner Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Vehicle Number : ");
		String vehicleNumber = sc.nextLine();
		System.out.println("Enter Vehicle  Type : ");
		String type = sc.nextLine();
		System.out.println("Enter Service center Name : ");
		String serviceCenter = sc.nextLine();
		System.out.println("Enter Service Category : ");
		String category = sc.nextLine();


		Servicevehicle sv = new Servicevehicle(name, vehicleNumber, type, serviceCenter, category);
		boolean condition = true;
		int choice = 0;

		do {

			System.out.println("1.Update Service Category\n"
					+ "2.Update Service Center Name\n"
					+ "3.View Vehicle Profile Details\n"
					+ "4.Exit the program\n");
			
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Please enter updated service category : ");
				String upcategory = sc.nextLine();
				sv.updateSErviceCategory(upcategory);

				break;
			}
			case 2:
			{
				System.out.println("Please enter updated Service Center name : ");
				String updated = sc.nextLine();
				sv.updateserviceCenterName(updated);
				break;
			}
			case 3:
			{
				sv.display();
				break;
			}
			case 4:{
				System.out.println("Exit");
				condition = false;
				break;
			}

			
		default :
			System.err.println("Unexpected value: ");
			break;
		}
		

		}while(condition);

		sc.close();
	}

}

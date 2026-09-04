package com.task.six;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Staff Name :  ");
		String staffName = sc.nextLine();
		System.out.println("Enter staff id : ");
		int staffID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Shift : ");
		String  shift = sc.nextLine();

		System.out.println("Enter Department Name : ");
		String departmentName = sc.nextLine();
		System.out.println("Enter Responsibility : ");
		String responsibilityLevel = sc.nextLine();



		DepartmentStaff ds = new DepartmentStaff(staffName, staffID, shift, departmentName, responsibilityLevel);




		int choice ;
		boolean check = true;

		do {


			System.out.println("1. Update Responsibility\r\n"
					+ "2. Update Department\r\n"
					+ "3. View Profile\r\n"
					+ "4. Exit\r\n");


			System.out.println("Enter choice : ");
			choice  = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Enter updated reaponsibility : ");
				String updated = sc.nextLine();
				ds.updateResponsibility(updated);
				break;
			}
			case 2:{
				System.out.println("Enter updated Department Name :");
				String updated = sc.nextLine();
				ds.updateDepartment(updated);
				break;
				

			}
			case 3:{
				
				ds.viewProfile();

			}
			case 4:{
				System.out.println("Exit");
				check = false;
				break;
			}
			default:

				System.out.println("Invalid Input ");
				break;
			}

		}while(check);
	}

}



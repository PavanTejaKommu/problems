package com.company;

import java.util.Scanner;

public class EmployeeProcessor {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		
		
		System.out.println("Enter salary : ");
		int sal = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Employee Designation : ");
		String desi = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter  Employee rating : ");
		int rating = sc.nextInt();
		 Employee ep = new  Employee(id, name, sal, desi, rating);
		 
		 System.out.println("=========================================");
		System.out.println("Employee ID : "+ep.getempID());
		System.out.println("Employee Name : "+ ep.getempName());
		System.out.println( "Employee Salary : "+ep.getsal());
		System.out.println( "Employee Designation : "+ep.getempDesi());
		System.out.println( "Employee Rating : "+ep.getrating());
		 
		ep.Employee();
		 
		 sc.close();
	}

}

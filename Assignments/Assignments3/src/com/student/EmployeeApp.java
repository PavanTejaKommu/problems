package com.student;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		Employee ep = new Employee();
		
		
		System.out.println("Enter employee ID : ");
		
		ep.setEmployeeId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter employee department : ");
		ep.setDepartment(sc.nextLine());
		
		System.out.println("Enter employee Name : ");
		ep.setEmployeeName(sc.nextLine());
		
		System.out.println("Enter employee salary : ");
		ep.setSalary(sc.nextDouble());
		
		
		
		System.out.println("Employee Details");
		System.out.println("-------------------------------------");
		System.out.println("Employee ID : "+ep.getEmployeeId());
		System.out.println("Employee Department : "+ep.getDepartment());
		System.out.println("Employee Name : "+ep.getEmployeeName());
		System.out.println("Employee Salary : "+ep.getSalary());
		
		sc.close();
	}

}

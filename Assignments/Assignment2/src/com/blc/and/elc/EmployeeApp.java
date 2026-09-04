package com.blc.and.elc;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee ep = new Employee();
		System.out.println("Enter Employee Name ");
		ep.empName = sc.nextLine();
		System.out.println("Enter Basic salary");
		ep.basicSalary = sc.nextInt();

		ep.displaySalaryDetails();
	}

}

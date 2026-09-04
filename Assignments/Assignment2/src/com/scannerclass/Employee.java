package com.scannerclass;

import java.util.Scanner;

public class Employee {


	int employeeID;
	String employeeName;
	int  Salary;
	int HRA;
	int DA;
	int GrossSalary;


	public Employee(int employeeID , String employeeName , int Salary) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.Salary = Salary;
	}

	public void calculate() {
		HRA = (Salary * 20)/100;

		DA = (Salary * 10)/100;

		GrossSalary = Salary + HRA + DA;


	}

	public void showdata() {
		System.out.println("Employee ID : "+employeeID);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Basic Salary : "+Salary);
		System.out.println("Employee Gross Salary : "+GrossSalary);
	}


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();


		System.out.println("Enter Basic Salary : ");
		int salary = sc.nextInt();

		Employee ep = new Employee(id, name, salary);
		
		ep.calculate();

		ep.showdata();




	}

}

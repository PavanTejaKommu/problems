package com.keyword;

import java.util.Scanner;

public class Employee {
	private  int employeeId;
	private String 	employeeName;
	private double salary;
	
	
	public void setEmployeeDetails(int employeeId , String employeeName , double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		System.out.println("Details added sucesdfully ");
		
	}
	
	
	public void  employeeDetails() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+salary);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
System.out.println("Enter Employee Id : ");
int id = sc.nextInt();
sc.nextLine();
System.out.println("Enter the Employee Name : ");
String name = sc.nextLine();

System.out.println("Enter Employee Salary  : ");
double salary = sc.nextDouble();


Employee ec = new Employee();
ec.setEmployeeDetails(id, name, salary);

ec.employeeDetails();

		
	}

}

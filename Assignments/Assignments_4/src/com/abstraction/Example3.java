package com.abstraction;

import java.util.Scanner;

abstract class Employee{

	String employeeName;
	String id;

	abstract void  calculateSalary();

	abstract void applyLeave();
	abstract void getDetails();

	public Employee(String employeeName, String id) {
		super();
		this.employeeName = employeeName;
		this.id = id;
	}





}


class FullTimeEmployee extends Employee{
	long basePay;
	long benifits;
	public FullTimeEmployee(String employeeName, String id, long basePay, long benifits) {
		super(employeeName, id);
		this.basePay = basePay;
		this.benifits = benifits;
	}
	@Override
	void calculateSalary() {
		System.out.println("Salry : "+(basePay + benifits));

	}
	@Override
	void applyLeave() {
		System.out.println("Leave applied succesfully");		
	}
	@Override
	void getDetails() {
		System.out.println("Employee Name : "+employeeName +"  ID : "+id);		
	}



}

class PartTimeEmployee extends Employee{
	int  hourlyRate;
	int hoursWorked;
	public PartTimeEmployee(String employeeName, String id, int hourlyRate, int hoursWorked) {
		super(employeeName, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	@Override
	void calculateSalary() {
		int total = hourlyRate * hoursWorked;

		System.out.println("Total Salary : "+total);

	}
	@Override
	void applyLeave() {
		System.out.println("Part Time employee applied leave Succesfully");

	}
	@Override
	void getDetails() {
		System.out.println("Employee Name : "+employeeName + " ID  : "+id);		
	}


}


class Freelancer extends Employee{
	double projectPayment;

	public Freelancer(String employeeName, String id, double projectPayment) {
		super(employeeName, id);
		this.projectPayment = projectPayment;
	}

	@Override
	void calculateSalary() {
		System.out.println("Calculate Salary : "+projectPayment);		
	}

	@Override
	void applyLeave() {
		System.out.println("Freelancer Applied for leave succesfully");		
	}

	@Override
	void getDetails() {
		System.out.println("Employee Details Name : "+employeeName+" ID : "+id);		
	}





}
public class Example3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);


		System.out.println("Select Employee Type : \n1.FullTime Employee\n2.PartTime Employee \n3.Freelancer");

		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			Employee emp = new FullTimeEmployee("John Doe", "12345", 50000, 10000);
			emp.applyLeave();
			emp.getDetails();

			break;
		}
		case 2: {
			Employee emp = new  PartTimeEmployee("Jane Smith", "67890", 20, 15);
			emp.applyLeave();
			emp.getDetails();

			break;
		}
		case 3: {
			Employee emp = new Freelancer("Alice Johnson", "54321", 5000);
			emp.applyLeave();
			emp.getDetails();

			break;
		}
		default:
			System.out.println("Invalid Input");		}


		sc.close();


	}

}

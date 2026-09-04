package com.blc.and.elc;

public class Employee {

	String empName;
	int basicSalary;
	int da;
	int hra;
	int grossSal;
	public void calculateHRA() {
		hra = (basicSalary*20)/100;
		System.out.println("Employee HRA : "+hra);

	}
	public void calculateDA() {
		da = (basicSalary*10)/100;
		System.out.println("Employee DA : "+da);
	}

	public void calculateGrossSalary() {
		grossSal = basicSalary + hra + da;
		System.out.println("Gross Salary : "+grossSal);

	}

	public void displaySalaryDetails() {
		System.out.println("Employee Name : "+empName);
		System.out.println("Basic salry : "+basicSalary);
		calculateHRA();
		calculateDA();
		calculateGrossSalary();


	}

}

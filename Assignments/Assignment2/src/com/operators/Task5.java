package com.operators;

import java.util.Scanner;

public class Task5 {
	static	int  basicsalary;
	static int hra;
	static int da;
	static int grosssalry;
	public static void salaryDetails() {
		System.out.println("Employee Salary *******");
		System.out.println("Basic Salary :"+basicsalary);
		System.out.println("HRA :"+hra);
		System.out.println("DA :"+da);

	}


	public static void Gross() {

		grosssalry = basicsalary + hra + da;
		System.out.println("Gross Salary :"+grosssalry);

	}

	public static void comparison() {
		if(grosssalry > 50000) {
			System.out.println("Gross Salry is greater than 50,000");
		}else {
			System.out.println("Gross Salary is not greater than 50,000");
		}

	}

	public static void increase() {

		grosssalry+=5000;
		System.out.println("Gross Salry after increasing 5000  is :"+grosssalry);

	}

	public void all() {
		salaryDetails();
		Gross();
		comparison();
		increase();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Task5 ts = new Task5();

		basicsalary =(50000);
		hra =(3000);
		da = (2000);

		ts.all();


	}

}

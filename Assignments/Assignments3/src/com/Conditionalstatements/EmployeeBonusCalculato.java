package com.Conditionalstatements;

import java.util.Scanner;

public class EmployeeBonusCalculato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salry");

		int salary = sc.nextInt();

		System.out.println("Employee Salary : "+salary);

		if(salary > 50000) {

			int discount = ((salary * 15)/100);
			System.out.println("Discount : "+discount);
			System.out.println("Total Salary : "+(salary + discount));



		}else if(salary <= 50000) {
			int discount = (salary * 10)/100;
			System.out.println("Discount : "+discount);
			System.out.println("Total Salary : "+(salary + discount));


		}else if(salary < 30000) {
			int discount = (salary * 5)/100;
			System.out.println("Discount : "+discount);
			System.out.println("Total Salary : "+(salary + discount));


		}
	}

}

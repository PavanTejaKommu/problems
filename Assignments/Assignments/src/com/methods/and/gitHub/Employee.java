package com.methods.and.gitHub;
import java.util.Scanner;

public class Employee {	

	static	int  basicsalary;
	static int hra;
	static int da;
	static int grosssalry;
	public static void salaryDetails() {
		System.out.println("employee Salary *******");
		System.out.println("Basic salary :"+basicsalary);
		System.out.println("HRA :"+hra);
		System.out.println("DA :"+da);

	}

	public static void grossSalary() {

		grosssalry = basicsalary+hra+da;
		System.out.println("Gross Salary :"+grosssalry);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee ep = new Employee();
		ep.basicsalary = sc.nextInt();
		ep.hra = sc.nextInt();
		ep.da = sc.nextInt();

		ep.salaryDetails();
		ep.grossSalary();



	}

}

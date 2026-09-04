package com.practice.classroom;
import java.util.*;
public class EmployeeProcessor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Employee ID : ");
		int empID = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name : ");
		String empname = sc.nextLine();
		
		System.out.println("Enter EmployeeDesignation : ");
		String empDesi = sc.nextLine();
		
		System.out.println("Enter Employee Salary : ");
		double empSalary = sc.nextDouble();
		
		System.out.println("Enter Employee Rating : ");
		int rating = sc.nextInt();
		

	Employee emp=new Employee(empID,
	empname,
	empDesi,
	empSalary,
	rating
);
	
	System.out.println("EMployee Id : "+emp.getEmpID());
	System.out.println("EMployee Name : "+emp.getEmpname());
	System.out.println("EMployee Desg : "+emp.getEmpDesi());
	System.out.println("EMployee Salary : "+emp.getEmpSalary());
	System.out.println("EMployee  : "+emp.getrRating(rating));
	
	System.out.println("============================");
	System.out.println("Yes this Employee is eligible to promotion current position as "+empDesi);
	emp.promoteEmployee(sc.nextLine());
	System.out.println("updated Desg : "+ emp.getEmpDesi());


}
}

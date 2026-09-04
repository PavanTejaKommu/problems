package com.saticandInstanceMethods;
import java.util.*;
//public class Employee {
//	public static String companyName = "TCS";
//	public int employeeId = 2244;
//	public String employeeName = "Tej";
//	
//	public static void companyInfo() {
//		System.out.println("Company Name  :"+companyName);
//		
//	}
//	
//	public void employeeInfo() {
//		System.out.println("Employee Id   :"+employeeId);
//		System.out.println("employee Nmae :"+employeeName);
//	}
//
//	public static void main(String[] args) {
//		Employee ep = new Employee();
//		ep.companyInfo();
//		ep.employeeInfo();
//		
//		Task 3: Employee Details
//		Create a class Employee with a static variable companyName, instance variables employeeId and employeeName.
//		Implement a static method companyInfo() and an instance method employeeInfo().
//		Create an object of the Employee class and call both methods to display:
//		Company Name : Infosys
//		Employee ID   : 1001
//		Employee Name : Ram

//	}
//
//}


public class Employee{
	static String companyname;
    int id;
	String Name;
	public  static void  companyInfo() {
		System.out.println(companyname);
	}
	public void employeeInfo() {
		System.out.println(id);
		System.out.println(Name);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		e.companyname=sc.nextLine();
		e.id=sc.nextInt();
		sc.nextLine();
		e.Name=sc.nextLine();
		
		
		e.companyInfo();
		e.employeeInfo();
		
		
		
		
	}
	
}
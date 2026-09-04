package com.practice.classroom;
import java.util.*;
public class Employee {
Scanner sc = new Scanner(System.in);
	int empID;
	String empname;
	String empDesi;
	double empSalary;
	int rating;

	public Employee(
			int empID,String empName,String empDesi,double empSalary, int rating
			) {


		this.empID  = empID;
		this.empname = empName;
		this.empDesi = empDesi;
		this.empSalary = empSalary;
		this.rating = rating;
		System.out.println("Details updated Successfull");


	}
	
	// getters 

	public int getEmpID() {
		System.out.println("Enter the emp id ");
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpname() {
		return empname;
	}
	public int getrRating(int rating) {
		return rating;
	}

	
	// setters 
	
	public void setEmpname(String empname) {
		System.out.println("Please enter the emp id ");
		this.empname = empname;
	}

	public String getEmpDesi() {
		return empDesi;
	}

	public void setEmpDesi(String empDesi) {
		this.empDesi = empDesi;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	public void promoteEmployee(String Desi) {
		if(rating >=4) {
			empSalary += empSalary *0.20;
			System.out.println("Employee got hike "+empSalary);
			
			System.out.println("Enter updated role here ");
			Desi = sc.nextLine();
			this.empDesi = Desi;
			
			
		}else {
			System.out.println("No pramotion");
		}
		
	}


}

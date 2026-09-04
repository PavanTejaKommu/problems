package com.company;

import java.util.Scanner;

public class Employee {
Scanner sc = new Scanner(System.in);
	private int empID;
	private String empName;
	private int empSal;
	private String empDesi;
	private  int rating ;
	//String new_desi ;
	
	
	public String pramotion(String new_desi) {
		return new_desi;
	}
	// getters 
	public int getempID() {
		return empID;
	}
	
	
	public  String getempName(){
		return empName;
	}
	
	
	public int getsal() {
		return empSal;
	}
	
	
	public String getempDesi() {
		return empDesi;
	}
	
	public int getrating() {
		return  rating;
	}
	
	
	// setters 
	public void setempID(int empID) {
		this.empID = empID;
	}
	
	
	
	public void setempName(String empName) {
		this.empName = empName;
		
	}
	
	
	public void setempSal(int empsal) {
		this.empSal = empSal;
	}
	
	public void setempDesi(String empDesi) {
		this.empDesi = empDesi;
	}
	
	public void setemprating(int rating) {
		this.rating = rating;
	}
	
	
	public  Employee(int empId , String empname , int empsal , String empDesi , int rating) {
this.empDesi = empDesi;
this.empID = empId;
this.empName = empname;
this.empSal = empsal;
this.rating = rating;

System.out.println("Details added Succesfully ");
		
		
	}
	
	
	public void  Employee() {
		if(rating >=4) {
			System.out.println("employee eligible for pramotion and salary hike");
			empSal = (empSal*20)/100 +empSal;
			System.out.println("Current salary "+empSal);
			System.out.println("Employee current Designation before pramotion : "+empDesi);
			System.out.println("Enter new Designation ");
			 setempDesi(pramotion(sc.nextLine()));
			 System.out.println("Employee current Designation after pramotion : "+empDesi);
		}else {
			System.err.println("Employee is not eligible for hike and pramotion ");
		}
	}
	
	
}

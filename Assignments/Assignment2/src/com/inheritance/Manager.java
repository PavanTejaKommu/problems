package com.inheritance;

public class Manager extends Employee {

	int bonous = 20000;
	
	
	int totalsal = salary+bonous;
	
	public static void main(String[] args) {

		Manager mg = new Manager();
		System.out.println("Salary : "+mg.salary);
		System.out.println("Bonous : "+mg.bonous);
		System.out.println("Total Salary : "+mg.totalsal);
		
		
		
	}

}

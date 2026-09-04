package com.task.three;

import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name : ");

		String employeeName = sc.nextLine();

		System.out.println("Enter Employee ID : ");
		int employeeID = sc.nextInt();
		sc.nextLine();
		

PerformanceEmployee pe = new PerformanceEmployee(employeeName, employeeID);


int choice ;
boolean limit = true;
do {
	
	
System.out.println("--- Menu ---\r\n"
		+ "1. Add Sales\r\n"
		+ "2. Recalculate Result\r\n"
		+ "3. View Summary\r\n"
		+ "4. Exit\r\n"
		+ "\r\n");
	
System.out.println("Enter the option : ");
choice = sc.nextInt();
sc.nextLine();

switch (choice) {
	
case 1: {
	System.out.println("Enter amount to add : ");
	int amount = sc.nextInt();
	sc.nextLine();
	pe.addsales(amount);
	
	break;
}
case 2:{
	

	break;
}
case 3:{
	System.out.println("Enter Performance : ");
	String performance = sc.nextLine();
	
	pe.viewPerformanceSummary(performance);
	break;
}
case 4:{
	System.out.println("Exit");
	limit = false;
	
	break;
}
default:
	System.out.println("Inavlid Input");
	break;
}


	}while(limit);

}
}

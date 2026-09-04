package com.task.three;

public class PerformanceEmployee extends SalesEmployee {

	int	totalSales;
	double averageSales;
	String	performanceGrade;
	int count=0;
	
	public PerformanceEmployee(String employeeName, int employeeID) {
		super(employeeName, employeeID);
	}
	
	public void addsales(int amount) {
		
		if(amount !=0 && amount>0) {
		count++;
		
		totalSales = totalSales+amount;
		System.out.println("Updated succesfully");
		}else {
			System.err.println("Enter   Amount above 0");
		}
	}
	
	
	public void viewPerformanceSummary(String performanec) {
		this.performanceGrade = performanec;
		System.out.println("*** Performance Summery ***");
		System.out.println("Employee Name : "+super.employeeName);
		System.out.println("Employee ID : "+super.employeeID);
		System.out.println("Total Sales : "+totalSales);
		if(count > 0 ) {
			averageSales = totalSales /count;
			System.out.println("Average Sales : "+averageSales);
		}else {
			System.out.println("Average sales : "+averageSales);
		}
		System.out.println("Performance : "+performanceGrade);
		System.out.println();
	}
	

	
	



}

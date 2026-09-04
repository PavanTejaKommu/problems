package com.task.eight;

public class StockPerformance  extends StockHandler{

	private String listOfStockQuantities;
	private double totalStockHandled;
	private double averageStockPerEntry;
	private String	handlingGrade;
	int count=0;

	public StockPerformance(String holdername, String holderID) {
		super(holdername, holderID);
	}

	public void addStock(int stock) {
		count++;
		totalStockHandled = totalStockHandled + stock;
		System.out.println("Stock Added");

	}

	public void recalculateResult(String grade) {
		averageStockPerEntry = totalStockHandled /count;
		handlingGrade = grade;

	}
	public void viewSummary() {
		System.out.println("Stock Profile created");
		System.out.println("Holder : "+holdername);
		System.out.println("Holder Id : "+holderID);
		System.out.println("List of stock Quantities : "+listOfStockQuantities);
		System.out.println("Total Stock Handled : "+totalStockHandled);
		System.out.println("Average Stock Per Entry : "+averageStockPerEntry);
		System.out.println("Handling Grade : "+handlingGrade);
		System.out.println();
	}



}

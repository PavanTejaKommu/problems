package com.blc.and.elc;

public class Student {
	String studentName;
	int javaMarks ;
	int SQLmarks;
	int webMarks;
	int total;
	public void calculateTotal() {
		total = javaMarks + SQLmarks + webMarks;
		System.out.println("Total Marks : "+total);

	}
	public void calculatePercentage() {

		float percentage = (total*100)/300;
		System.out.println("Marks percentage :"+percentage+"%");

	}
	public void displayStudentDetails() {
		System.out.println("Student Name :"+studentName);

	}


}

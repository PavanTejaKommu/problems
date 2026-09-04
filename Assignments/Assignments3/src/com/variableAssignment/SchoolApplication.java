package com.variableAssignment;

public class SchoolApplication {

	public static String schoolName  = "JNTUH";
	public  String studentName  = "Teja";
	public  int rollNo = 111;

	public static void main(String[] args) {

		int  marks = 20;

		SchoolApplication sc = new SchoolApplication();
		
		System.out.println("School Name    : "+sc.schoolName);
		System.out.println(	"Student Name   : "+sc.studentName);
		System.out.println(	"Student Roll no: "+sc.rollNo);
		System.out.println("Marks          : " +marks);
	}

}

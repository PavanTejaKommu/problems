package com.keyword;

import java.util.Scanner;

public class Student {

	private  int studentId;
	private	String studentName ;
	private String course;

	public void setDetails(int studentId , String studentName, String course) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;


	}

	public void displayDetails() {
		System.out.println("Student id : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Course : "+course);


	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student st = new Student();
		System.out.println("Enter student Id : ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter the Student Name : ");
		String name = sc.nextLine();

		System.out.println("Enter the course : ");
		String course = sc.nextLine();

		st.setDetails(id, name,course);
		st.displayDetails();
		sc.close();

	}

}

package com.scannerclass;

import java.util.Scanner;

public class Student {



	int StudentID;
	String  Name;
	int Age;
	String Course;
	
	
	public Student(int StudentID , String Name , int Age , String Course) {
		this.StudentID = StudentID;
		this.Name = Name;
		this.Age = Age;
		this.Course = Course;
		
		System.out.println();
		
	}
	
	public void getStudent() {
		
		System.out.println("*** Student Details ***");
		System.out.println("Student ID : "+StudentID);
		System.out.println("Student Name : "+Name);
		System.out.println("Student Age : "+Age);
		System.out.println("Student Course : "+Course);
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student course : ");
		String course = sc.nextLine();
		
		
		
		Student st = new Student(id, name, age, course);
		st.getStudent();

	}

}

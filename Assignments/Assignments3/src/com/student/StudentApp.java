package com.student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		Student st = new Student();

		System.out.println("Enter Student ID : ");
		st.setStudentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Student Name : ");
		st.setStudentName(sc.nextLine());
		
		
		System.out.println("Enter Student course : ");
		st.setCourse(sc.nextLine());
		
		
		System.out.println("Enter Student Percentage : ");
		st.setPercentage(sc.nextDouble());
		
		
		
		System.out.println("Student ID : "+st.getStudentId());
		System.out.println("Student Name : "+st.getStudentName());
		System.out.println("Student Course : "+st.getCourse());
		System.out.println("Student Percentage : "+st.getPercentage());
		
		sc.close();
		
		
		
	}

}

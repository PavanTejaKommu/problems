package com.blc.and.elc;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student st = new Student();

		System.out.println("Enter Student Name : ");
		st.studentName = sc.nextLine();

		System.out.println(" Enter java Marks : ");
		st.javaMarks = sc.nextInt();

		System.out.println("Enter SQL Marks : ");
		st.SQLmarks = sc.nextInt();

		System.out.println("Enter Web Marks : ");
		st.webMarks = sc.nextInt();


		sc.nextLine();

		st.displayStudentDetails();
		st.calculateTotal();
		st.calculatePercentage();

	}

}

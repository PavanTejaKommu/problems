package com.conditionalstatementsswitchcase;

import java.util.Scanner;

public class StudentGradeCalculator {


	public void marks(int marks) {
		if(marks <=100 && marks>=90) {
			System.out.println("Student got A ");
		}else if(marks <=89 && marks>=80 ) {
			System.out.println("Student got B ");
		}else if(marks <=79 && marks>=70) {
			System.out.println("Student got C ");
		}else if(marks <=69 && marks>=60) {
			System.out.println("Student got D");
		}else if(marks<=59 && marks>=50) {
			System.out.println("Student got failed");
		}else {
			System.out.println("Invalid input");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter Student Marks ");

		StudentGradeCalculator obj = new StudentGradeCalculator();
		obj.marks(sc.nextInt());

	}

}

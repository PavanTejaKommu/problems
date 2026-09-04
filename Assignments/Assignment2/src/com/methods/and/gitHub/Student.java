package com.methods.and.gitHub;

import java.util.Scanner;

public class Student {

	int sub1 ;
	int sub2 ;
	int sub3 ;
	int sub4 ;
	int sub5 ;
	int total;
	float percentage;

	public void readMarks() {
		System.out.println("***** Student Report *****");
		System.out.println("marks in sub1 :"+sub1);
		System.out.println("marks in sub2 :"+sub2);
		System.out.println("marks in sub3 :"+sub3);
		System.out.println("marks in sub5 :"+sub4);
		System.out.println("marks in sub5 :"+sub5);

	}

	public void calculatePercentage() {
		total = sub1+sub2+sub3+sub4+sub5;

		percentage = (total*100)/500;
		System.out.println("Percentage    :"+percentage);


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		st.sub1 = sc.nextInt();
		st.sub2= sc.nextInt();
		st.sub3 = sc.nextInt();
		st.sub4 = sc.nextInt();
		st.sub5 = sc.nextInt();

		st.readMarks();
		st.calculatePercentage();


	}

}

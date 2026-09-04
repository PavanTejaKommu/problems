package com.method_Access_Assignment;
import java.util.*;

public class Student {

	int sub1  =70;
	int sub2 = 90;
	int sub3 =67;
	int sub4 =98;
	int sub5 =80;
	int total_marks;
	float percentage ;


	public void calculatePercentage() {

		System.out.println("Student Report Crad ");

		total_marks = sub1+sub2+sub3+sub4+sub5;

		System.out.println("Toatal Marks : "+ total_marks);

		percentage= ((total_marks*100)/500);

		System.out.println("Percentage   : " +percentage);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		Student st = new Student();
		st.calculatePercentage();





	}

}

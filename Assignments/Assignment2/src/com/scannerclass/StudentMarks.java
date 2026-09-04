package com.scannerclass;

import java.util.Scanner;

public class StudentMarks {

	int totalMarks;
	int	Average;
	float	Percentage;

	int java ;
	int css;
	int html;
	int sql;
	int javaScript;

	public StudentMarks(int java , int css , int html , int sql , int javaScript) {
		this.java = java;
		this.css = css;
		this.html = html;
		this.sql = sql;
		this.javaScript = javaScript;

	}

	public void setDetails() {

		totalMarks = java + css + html + sql + javaScript;

		Average = (java + css + html + sql + javaScript)/5;
		Percentage = (totalMarks*100)/500;

	}

	public void showData() {
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Average Marks : "+Average);
		System.out.println("Percentage : "+Percentage);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter java marks : ");
		int java = sc.nextInt();


		System.out.println("Enter css marks : ");
		int css = sc.nextInt();

		System.out.println("Enter html marks : ");
		int html = sc.nextInt();

		System.out.println("Enter sql marks : ");
		int sql = sc.nextInt();

		System.out.println("Enter javaScript marks : ");
		int javaScript = sc.nextInt();

		StudentMarks sm = new StudentMarks(java, css, html, sql, javaScript);
		sm.setDetails();
		sm.showData();




	}

}

package com.student;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student Name : ");
		String name = sc.nextLine();

		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter student Course : ");
		String course = sc.nextLine();


		System.out.println("Enter first subject Marks : ");
		double totalmarks = sc.nextDouble();





		StudentResult sr = new StudentResult(name, id, course, totalmarks);
		int choice;



		do {
			System.out.println("1. Add more subject marks") ;
			System.out.println("2. Calculate grade");
			System.out.println( "3. View total marks");
			System.out.println("4. Exit");

			System.out.println("Enter the choice : ");
			choice = sc.nextInt();	

			switch(choice) {
			case 1:
			{
				System.out.println("Enter marks to add : ");
				int add = sc.nextInt();
				sr.addMarks(add);
				break;
			}
			case 2:{
				sr.calculateGrade();
				break;
			}
			case 3:{
				sr.viewTotal();
				break;
			}
			case 4:{
				System.out.println("Exit");
				break;
			}default:{
				System.err.println("Inavlid Input ");
			}
			}
		}while(choice != 4);


	}

}

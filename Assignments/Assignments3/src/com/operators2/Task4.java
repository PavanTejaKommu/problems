package com.operators2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int number = sc.nextInt();

		System.out.println("Original Number : "+number);


		System.out.println("Complement Result :"+(~number));

	}

}

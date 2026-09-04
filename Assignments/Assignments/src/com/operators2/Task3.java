package com.operators2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {


		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();

		System.out.println("Result After Left Shift : "+(number >> 2));

	}

}

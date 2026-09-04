package com.operators2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first  Number");
		int num1 = sc.nextInt();

		System.out.println("Enter second  Number");
		int num2 = sc.nextInt();

		System.out.println("Bitwise AND : "+(num1 & num2));
		System.out.println("Bitwise OR  : "+(num1 | num2));
		System.out.println("Bitwise XOR : "+(num1 ^ num2));





	}

}

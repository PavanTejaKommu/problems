package com.conditionalstatementsswitchcase;

import java.util.Scanner;

public class Calculator {
	int num1 ;
	int num2;

	public void calculation(String operator) {

		switch (operator) {
		case "+": {

			System.out.println("Result : "+(num1+num2));


			break;
		}
		case "-": {

			System.out.println("Result : "+(num1-num2));
			break;
		}
		case "*": {

			System.out.println("Result : "+(num1*num2));
			break;
		}
		case "/": {

			System.out.println("Result : "+(num1/num2));
			break;
		}
		case "%": {

			System.out.println("Result : "+(num1%num2));
			break;
		}

		default:
			System.out.println("Inlavid input");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator obj = new Calculator();

		System.out.println("Enter First Number : ");
		obj.num1 = sc.nextInt();

		System.out.println("Enter Second Number : ");
		obj.num2 = sc.nextInt();

		System.out.println("Enter the operator (+,-,*,/,%): ");
		obj.calculation(sc.next());

		sc.close();
	}

}

package com.problemsolving;

import java.util.Scanner;

public class Default {
	public static void main(String[] args) {
		System.out.println("Enter an y number between 1 to 4 numbers : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) {
		case 1: {
			System.out.println("Sunny");
			break;
		}
		case 2: {
			System.out.println("Cloud");
			break;
		}case 3: {
			System.out.println("Cold");
			break;
		}case 4: {
			System.out.println("------");
			break;
		}
		default:
			System.err.println("Un known number ");
		}
	}
}

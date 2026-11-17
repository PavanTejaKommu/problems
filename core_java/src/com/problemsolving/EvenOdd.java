package com.problemsolving;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		//without  % operator 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		if((num &1) == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		sc.close();
	}

}

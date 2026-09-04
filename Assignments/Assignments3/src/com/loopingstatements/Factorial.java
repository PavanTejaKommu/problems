package com.loopingstatements;

import java.util.Scanner;

public class Factorial {

	public void getfactorial(int num) {
		int factorial =1;
		for(int i=1;i<=num;i++) {
			factorial*=i;

		}
		System.out.println(factorial);

	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Factorial  obj = new Factorial ();
		System.out.println("Enter the number");
		obj.getfactorial(sc.nextInt());

	}

}

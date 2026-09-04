package com.looping.statements;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public void sum(int num) {
		int i =0;
		int sum =0;
		while(i<=num) {
			sum  = sum+i;
			i++;

		}
		System.out.println("Sum "+sum);


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SumofNaturalNumbers sn = new SumofNaturalNumbers();
		System.out.println("Enter the number ");

		sn.sum(sc.nextInt());



	}

}

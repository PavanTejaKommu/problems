package com.loopingstatements;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public void sum(int num) {
		int sum =0;
		for(int i =0;i<=num;i++) {
			sum +=i;

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		SumofNaturalNumbers obj = new SumofNaturalNumbers();
		System.out.println("Enter Number");
		obj.sum(sc.nextInt());
	}

}

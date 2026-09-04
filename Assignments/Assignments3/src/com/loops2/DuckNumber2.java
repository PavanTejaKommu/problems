package com.loops2;

import java.util.Scanner;

public class DuckNumber2 {

	public boolean isDucknumber(int num) {
		int temp =num;
		if(num > 0) {
			while(num > 0) {
				int remin = num % 10;
				if(remin == 0) {
					return true;
				}
				num/=10;

			}
		}else {
			System.err.println("Please enter the value above 0");
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		DuckNumber2 dc = new DuckNumber2();
		System.out.println("Enter the number to check : ");
		System.out.println(dc.isDucknumber(sc.nextInt())
				?"It is an duck number"
						: "It is not an duck number");

	}

}

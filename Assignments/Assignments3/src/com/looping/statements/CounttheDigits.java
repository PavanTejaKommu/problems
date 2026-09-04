package com.looping.statements;

import java.util.Scanner;

public class CounttheDigits {

	public void counting(int num) {
		int 	temp = num;
		int temp2;
		int i=0;

		while(temp > 0) {
			temp2 = temp%10;
			if(temp2 != 0) {
				i++;

			}
			temp= temp/10;

		}
		System.out.println("No : "+i);

	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		CounttheDigits cd = new CounttheDigits();
		System.out.println("Enter the number");
		cd.counting(sc.nextInt());
	}

}

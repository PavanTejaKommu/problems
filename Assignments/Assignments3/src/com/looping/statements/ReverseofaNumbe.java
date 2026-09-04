package com.looping.statements;

import java.util.Scanner;

public class ReverseofaNumbe {


	public void palindrome(int num) {
		int temp = num;
		int reversed = 0;
		int reminder;
		while(temp!=0) {
			reminder = temp%10;
			reversed = reversed*10+reminder;
			temp = temp/10;


		}
		System.out.println("Reversed : "+reversed);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReverseofaNumbe rc = new ReverseofaNumbe();
		System.out.println("Enter the number to print in  reverse order");

		rc.palindrome(sc.nextInt());


	}

}

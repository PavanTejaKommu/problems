package com.loops;

import java.util.Scanner;

public class AutomorphicNumber {
	
	public int count(int number) {
		int count =0;
		while(number > 0) {
				count++;
			
			number = number/10;
		}
		return count;
	}
	
	public int square(int digit) {
		int square = digit * digit;
		return square;
	}
	
	
	public boolean isAutomorphicNumber(int num) {
		
		int temp = num;
		int square = square(num);
		int count = count(num);
		int sum = 0;
			
		int power =(int) Math.pow(10, count);
		
			if(square% power == temp  ) {
				return true;
			}
			
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AutomorphicNumber ap = new AutomorphicNumber();
		System.out.println("Enter the number to check : ");
	System.out.println(ap.isAutomorphicNumber(sc.nextInt())
				?"Is Automorphic Number " : "Is not Automorphic Number ");


	}

}

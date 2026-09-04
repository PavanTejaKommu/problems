package com.loops2;

import java.util.Scanner;

public class HarshadNumbe {
	
	
	public boolean isharshadNumber(int num) {
		int temp = num;
		int rem ; 
		int sum = 0;
		while(temp > 0) {
			rem = temp %10;
			sum = sum+rem;
			temp=temp/10;

		}
		if(num%sum ==0 ) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HarshadNumbe hn = new HarshadNumbe();
		
		System.out.println("Enter the number to check : ");
		System.out.println(hn.isharshadNumber(sc.nextInt()) 
				? "It is a harshad number " : " It is not an harshad number");

	}

}

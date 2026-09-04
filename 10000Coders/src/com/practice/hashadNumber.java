package com.practice;
import java.util.*;
public class hashadNumber {
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

		hashadNumber hh = new  hashadNumber();
		System.out.println("Enter Number : ");
		System.out.println(hh.isharshadNumber(sc.nextInt())
				?"Is harshad Number" : "Is not harshad Number");

	}

}

package com.practice;
import java.util.*;

public class Example2 {
	public void checkPlaindrome(int num) {
		int temp = num;
		int reversed = 0;
		while(temp >0) {

			int reminder = temp%10;
			reversed = reversed * 10 + reminder;
			temp = temp/10;

		}

		if(reversed == num) {
			System.out.println("Given  number is an palindrome : "+num);
		}else {
			System.out.println("Given  number is not  an palindrome : "+num);
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Example2 ep = new Example2();
		System.out.println("Enterbthe number to check : ");
		ep.checkPlaindrome(sc.nextInt());

	}

}

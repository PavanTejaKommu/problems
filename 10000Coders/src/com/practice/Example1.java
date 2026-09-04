package com.practice;
import java.util.*;

public class Example1 {

	public void clc( int num) {

		int	temp = num;
		int sum = 0;
		int count=0;

		while(num > 0) {

			count++;
			num = num/10;
		}

		num = temp;

		while(num > 0) {

			int digit = num%10;

			int power = 1;

			for(int i =1;i<=count;i++) {

				power  = power * digit;

			}

			sum = sum + power;

			num=num/10;
		}

		System.out.println("Sum"+sum);

		if(temp == sum) {
			System.out.println("It is an amstrong number");
		}else {
			System.out.println("it is not an amstong ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Example1 ep = new Example1();
		System.out.println("Enter the number : ");

		ep.clc(sc.nextInt());

	}

}

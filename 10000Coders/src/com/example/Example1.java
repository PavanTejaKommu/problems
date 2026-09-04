package com.example;

import java.util.Scanner;

public class Example1 {
	
	
	public  static void count(int num) {
		int temp = num;
		int sum =0;
		int count =0;
		int power = 1;
		
		while(num > 0) {
			
			if(num % 10 !=0) {
				count++;
				 num = num/10;
			}
		}
		
		System.out.println("Count : "+count);
		
		for(int i =1;i<= count;i++) {
			power = power * i ;
			
			
		}
		System.out.println(power);
		
		sum = power;
		System.out.println("Checking : "+(temp==sum));
		
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the num : ");
		count(sc.nextInt());
		
		//System.out.println();

	}

}

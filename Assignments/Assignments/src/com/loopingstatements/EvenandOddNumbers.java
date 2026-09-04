package com.loopingstatements;

import java.util.Scanner;

public class EvenandOddNumbers {

	public void even(int num) {
		for(int i =2;i<=num;i++) {
			if(i%2==0) {
				System.out.println("Even Number : "+i);
			}
		}
	}



	public void odd(int num) {
		for(int i =0;i<=num;i++) {
			if(i%2!=0) {
				System.out.println("Odd Number : "+i);
			}
		}
	}




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenandOddNumbers obj = new EvenandOddNumbers();
		System.out.println("Enter number for even range : ");
		obj.even(sc.nextInt());
		System.out.println("Enter number for odd range : ");
		obj.odd(sc.nextInt());



	}

}

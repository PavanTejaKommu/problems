package com.task.ten;

import java.util.Scanner;

public class Fibonacci {
	
	
	public void fibiPrint(int num) {
		int first = 0;
		int second = 1;
		for(int i =1;i<= num;i++) {
			
			System.out.println(first);
			int show = first + second;
			first = second;
			second = show;
			
		}
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Fibonacci f= new Fibonacci();
System.out.println("Enter Number : ");
int num = sc.nextInt();
f.fibiPrint(num);
	}

}

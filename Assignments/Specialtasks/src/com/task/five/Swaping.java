package com.task.five;

import java.util.Scanner;

public class Swaping {
	
	public void todo(int a , int b) {
		
		System.out.println(" "+a + " "+b);
		a = a+b;
		
		b = a-b;
		 
		a = a-b;
		
		System.out.println(" "+a + " "+b);
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Swaping s = new Swaping();
		
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
		sc.nextLine();
		s.todo(a, b);
		
	}

}

package com.scanner;

import java.util.Scanner;

public class Example2 {
	
	public void getData(String gender  , int age ) {
		
		if((gender.equals("male") && age >= 27 ) ||
				age>=23 && gender.equals("female")){
			
			System.out.println("Eligible ");
		}else {
			System.out.println("not");
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the gender : ");
		
		String name = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
	}

}

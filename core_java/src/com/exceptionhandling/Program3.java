package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter size : ");
			int arr[] = new int [sc.nextInt()];
			
			System.out.println(arr[100]);
		} catch (Exception e) {

		e.printStackTrace();
		}
		
		System.out.println("I am executed ");
		sc.close();
	}

}

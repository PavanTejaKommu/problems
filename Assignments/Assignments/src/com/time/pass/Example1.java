package com.time.pass;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("Enter no of coloums : ");
		int columns = sc.nextInt();
		
		int arr1[][]= new int[rows][columns];
		
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.println("Please Enter the value to insert at index["+i+"]["+j+"]");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}

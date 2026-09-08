package com.arrays;

import java.util.Scanner;

public class ArrayUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows = sc.nextInt();
		
		
		System.out.println("Enter Column : ");
		int column = sc.nextInt();
		
		
		int arr[][] = new int [rows][column];
		
		
		for(int i =0 ; i < arr.length;i++) {
			for(int j =0; j < arr.length;j++) {
				
				System.out.println("Enter the  alue to insert at index ["+i+"] ["+j+"]  : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		
		
		for(int i =0;i <arr.length;i++) {
			for(int j =0; j< arr.length;j++) {
				System.out.print( " "+arr[i][j]);
			}
			System.out.println();
		}
		
	}

}

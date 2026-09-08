package com.arrays;

import java.util.Scanner;

public class JaggedArray {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr rows : ");
		int rows = sc.nextInt();
		sc.nextLine();
		int arr[][] = new int [rows][];
		
		for(int i =0;i< arr.length;i++) {
			System.out.println("Enter Columns : ");
			int column = sc.nextInt();
			arr[i] = new int [column];
			for(int j =0; j< column;j++) {
				System.out.println("Enter element : ");
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		
		
		
	}
}

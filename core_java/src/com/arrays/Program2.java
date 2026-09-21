package com.arrays;

import java.util.Scanner;

public class Program2 {
	Scanner sc = new Scanner(System.in);
	
	private void matrix(){
		System.out.println("Enter Rows : ");
		int rows= sc.nextInt();
		
		int arr[] [] = new int [rows][];
		
		
		for(int i =0 ; i < arr.length;i++) {
			System.out.println("Enter how many columns : ");
			int col = sc.nextInt();
			arr[i] = new int [col];
			for(int j=0; j <col; j++) {
				
				System.out.println("Enter Value to insert at ["+i+"] ["+j+"] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i =0; i < arr.length;i++) {
			for(int j =0; j <= arr.length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Program2 pg2 = new Program2();
		
		pg2.matrix();
	}

}

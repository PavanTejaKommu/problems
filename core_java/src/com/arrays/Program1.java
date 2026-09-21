package com.arrays;

import java.util.Scanner;

public class Program1 {
	Scanner sc = new Scanner(System.in);
	

	
	private void matrix() {
		
		System.out.println("Enter Rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter Columns : ");
		int columns= sc.nextInt();
		
		int arr[][]= new int [rows][columns];
		
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j =0; j < arr.length;j++) {
				
				System.out.println("Enter value to Insert at index ["+i+"] ["+j+"] : ");
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		
for(int i=0; i<arr.length;i++) {
			
			for(int j =0; j < arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Program1 p1 = new Program1();
		
		p1.matrix();
	}
	
	

}

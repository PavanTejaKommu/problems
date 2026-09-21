package com.arrays;

public class Program4 {

	
	
	public static void main(String[] args) {
		int matrix [][] = {
				{3,4,5},
				{7,9,4}
		};
		
		int rows= matrix.length;
		int col = matrix[0].length;
		
		
		int arr[][] = new int [rows][col];
		
		
		for(int i =0; i < matrix.length;i++) {
			for(int j =0 ; j < matrix[i].length;j++) {
//				System.out.print(matrix[j][i]+" ");
				
				arr[i][j] = matrix[j][i];
			}
//			System.out.println();
		}
	
		
//		for(int i =0; i < matrix.length;i++) {
//			for(int j =0 ; j < matrix[i].length;j++) {
//				
//				System.out.print(matrix[j][i]+" ");
//				
//			}
//			System.out.println();
//		
//		}
		
		
}
}

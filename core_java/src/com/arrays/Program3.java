package com.arrays;

public class Program3 {
	public static void main(String[] args) {
		int arr1 [][] = {
				{1,2},
				{5,6}
		};
		int arr2 [][] = {
				{6,4},
				{8,3}
		};


		int arr3 [] [] = new int [arr1.length][arr2.length];


		for(int i =0; i < arr1.length;i++) {
			for(int j =0; j < arr2.length;j++) {

				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}



		for(int i =0; i < arr1.length;i++) {
			for(int j =0; j < arr2.length;j++) {

				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}



	}

}

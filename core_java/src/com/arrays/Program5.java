package com.arrays;

public class Program5 {
	public static void main(String[] args) {
		
		
		
		int arr [][] = {
				{3,4,5},
				{7,9,4}
		};
		int max =0;
		
		for(int i =0; i < arr.length;i++) {
			for(int j =0; j < arr.length;j++) {
				
				if(arr[i][j] > max) {
					max= arr[i][j];
				}
			}
		}
		System.out.println("Max : "+max);
		
		
	}

}

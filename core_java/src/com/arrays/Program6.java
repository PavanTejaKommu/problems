package com.arrays;

public class Program6 {
	public static void main(String[] args) {
		
		
		int arr[][] = {
				
				{6,7,2},
				{3,4,1},
				{9, 11 , 3}
				
		};
		
		for(int i =0; i < arr.length;i++) {
			for(int j =0; j < arr.length;j++) {
				
				if(j > i) {
					arr[j] [i] =0;
				}
			}
			
			
			
			
			
		}
		
		for(int i =0; i < arr.length;i++) {
			for(int j =0; j < arr.length;j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}

package com.arrays;

public class LastOccurance {
	
	public static void main(String[] args) {
		int arr [] = {1 , 2 , 3, 4,56, 23 , 21 , 53, 67 , 79};
		
		int num = 100;
		for(int i =0; i < arr.length;i++) {
			if(arr[i] == num ) {
				System.out.println("Index at : "+i);
			}else {
				System.out.println("No Occurance ");
				break;
			}
			
		}
		
	}

}

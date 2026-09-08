package com.arrays;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = { 12 , 23 , 45, 54, 67, 89, 98 , 90 };
		
		int max = 0 ; 
		
		
		for(int i =0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Max Number : "+max);
	}

}

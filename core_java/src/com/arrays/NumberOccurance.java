package com.arrays;

public class NumberOccurance {
	public static void main(String[] args) {
		
		
		int arr [] = {1 , 23, 45, 53, 67, 78, 23 , 23 , 23, 23, 23, 23,23};
		int count=0;
		int num = 23;
		for(int i =0 ;i < arr.length;i++) {
			if(arr[i] == num ) {
				count++;
			}
			
		}
		System.out.println("Occurance time : "+count);
		
		
	}

}

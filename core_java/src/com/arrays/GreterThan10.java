package com.arrays;

public class GreterThan10 {

	public static void main(String[] args) {
		
		int arr[] = {10 , 20 , 30 , 35 , 6 , 34 , 72 , 100 , 50};
		int count=0;
		
		for(int i =0; i < arr.length;i++) {
			if(arr[i] > 10) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}

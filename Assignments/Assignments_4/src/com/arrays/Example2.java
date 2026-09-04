package com.arrays;

public class Example2 {
	
	
	// second max 
	
	public static void main(String[] args) {
		int arr[] = {12, 23, 45, 85,41,21};
		
		int firstMax =0;
		int secondmax=0;
		
		for(int i =0;i < arr.length;i++) {
			if(arr[i] > firstMax) {
				secondmax = firstMax;
				firstMax = arr[i];
			}
		}
		
		System.out.println("Second max : "+secondmax);
	}

}

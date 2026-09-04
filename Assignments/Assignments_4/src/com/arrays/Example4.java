package com.arrays;

public class Example4 {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		//finding Min
		int arr[]= {10, 25, 7, 89, 45};
//		int arr[] = { 5, 2, 9, 1, 3};

		int min =arr[0];
		for(int i =0; i< arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				
			}
		}
		System.out.println("MIn : "+min);
		
		
		
		
		
		
		
//		
//		
//		// Maximun value in an array
//		int max = 0 ;
//		
//		
//		for(int i =0; i < arr.length;i++) {
//			if(arr[i] > max) {
//				max= arr[i];
//			}
//		}
//		
//		System.out.println("Max : "+max);
	}

}

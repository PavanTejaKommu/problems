package com.arrays;

public class PrimieNumberSum {
	public static void main(String[] args) {
		
		int arr[] = { 23, 21 , 34 , 54 , 56 , 89 , 63 , 71};
		
		int sum =0;
		for(int i =0; i< arr.length;i++) {
			
			int count =0;
			
			for(int j =1 ; j <= arr[i] ;j++ ) {
				if(arr[i] % j ==0) {
					count++;
				}
			}
			
			if(count <= 2) {
				
				if(arr[i] > 10) {
					sum+=arr[i];
				}
				
			}
			
		}
		
		
		System.out.println(" Sum : "+sum);
		
	}

}

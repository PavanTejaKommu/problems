package com.arrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		
		int arr [] = {10 ,15 ,20 ,25 ,30 , 5};
		
		for(int i =0; i< arr.length;i++) {
			int count =0;
			
			for(int j =1; j <= arr[i] ; j++) {
				if(arr[i] % j == 0) {
					count ++;
					
				}
				
			}
			
			
			if(count <= 2) {
				
				if(arr[i] % 5 ==0) {
					System.out.println("Number : "+arr[i]);
				}
			}
		}
		

	}

}

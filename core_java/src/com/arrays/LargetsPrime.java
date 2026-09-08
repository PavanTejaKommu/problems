package com.arrays;

public class LargetsPrime {
	
	public static void main(String[] args) {
		
		
		int arr [] = {23 , 23, 12, 45, 56, 67, 89 ,90, 100};
		int largest=0;
		int index = 0;
		
		for(int i =0 ; i < arr.length;i++) {
			int count =0; 
			for(int j =1; j<= arr[i];j++) {
				if(arr[i] % j == 0) {
					count++;
				}
			}
			
			if(count <=2) {
				
				if(arr[i] > largest) {
					largest = arr[i];
					index = i;
				}
				
			}
		}
		
		
		System.out.println(arr[index]);
		
		
	}

}

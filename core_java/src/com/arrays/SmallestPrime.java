package com.arrays;

public class SmallestPrime {
	public static void main(String[] args) {
		
		
		
		int arr [] = {23, 21, 45, 67, 79 , 81 , 93, 35};
		int minPrime=0;
		int index =0;
		
		
		for(int i =0; i< arr.length;i++) {
			
			int count =0;
			
			for(int j =1; j <=arr[i];j++) {
				
				if(arr[i] % j == 0) {
					count++;
				}
				
			}
			
			if(count <=2) {
				if(arr[i] < minPrime) {
					minPrime = arr[i];
					index = i;
				}
			}
		}
		System.out.println(arr[index]);
	}

}

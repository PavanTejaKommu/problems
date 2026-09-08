package com.arrays;

public class DivisibleBy5 {
	public static void main(String[] args) {
		
		
		
		int arr[] = {10 , 20 , 23 , 24 , 35 , 21 , 90 , 45, 39, 82, 80};
		int count =0;
		for(int i =0 ; i < arr.length;i++) {
			if(arr[i] % 5 ==0) {
				count++;
			}
		}
		
		System.out.println("Divisible By 5 : "+count);
		
	}

}

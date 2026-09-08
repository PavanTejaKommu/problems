package com.arrays;

import java.util.Arrays;

public class EvenOrOdd {
	public static void main(String[] args) {
		
		
		int arr [] = {
				
				10 ,-5 ,20 ,-8 ,15 ,-2
		};
		
		
		for(int i =0 ; i< arr.length;i++) {
			
			if(arr[i] < 0) {
				
			System.out.print(" "+arr[i]);
				
				
			}
			
		}
		System.out.println();
		
for(int i =0 ; i< arr.length;i++) {
			
			if(arr[i]    > 0) {
				
			System.out.print(" "+arr[i]);
				
				
			}
			
		}
		
		
		
		
		
	}

}

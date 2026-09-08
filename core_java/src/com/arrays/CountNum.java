package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountNum {

	public static void main(String[] args) {
		int temp =0;
		for(int i =10 ; i <= 50 ; i++) {
		temp++;	
		}
		
		int arr[] = new int [temp];
		
		
		for(int i = 0 ; i < arr.length;i++) {
				arr[i] = i + 10;
			
		}
		
		
		for(int i =0 ; i < arr.length;i++) {
			int count =0; 
			
			for(int j =1 ; j <=arr[i] ; j++) {
				if(arr[i] % j == 0) {
					count ++;
				}
			}
			if(count <= 2 ) {
				System.out.println(arr[i]);
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));

	}

}

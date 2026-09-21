package com.arrays;

import java.util.Arrays;

public class Program9 {

	
	public static void main(String[] args) {
		
		int arr [] = {7,8,9,0,3,2};
		int left =0;
		int right=arr.length-1;
		
		for(int i =0; i < arr.length;i++) {
			while(left< right) {
				
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

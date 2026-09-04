package com.arrays;

import java.util.Arrays;

public class Example1 {
	
	public static void main(String[] args) {
		
		
		// print in reverse order array 
		
		int arr[] = {10,11,34,23,16,15,27};
		
		int left =0;
		int right = arr.length-1;
		
		while(left > right) {
			int temp = arr[right];
			
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
		//java.util.Arrays.toString(arr);
	}

}

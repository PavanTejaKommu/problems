package com.arrays;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 8, 2, 3, 5, 3, 1, 0 };
		int k =4;
		
		for(int i =0;i<k;i++) {
			int first = arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = first;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}

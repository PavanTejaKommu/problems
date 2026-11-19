package com.arrays;

import java.util.Arrays;

public class RptationRight {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 8, 2, 3, 5, 3, 1, 0 };
		int k =4;
		
		for(int i=0;i<k;i++) {
			int last = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}

package com.arrays;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		
		
		
		int arr1[] = {1,2,3,34,32,23,54,67,90,99,56};
		
		int arr2 []= new int [arr1.length];	
		
		for(int i = 0 ;i<arr1.length;i++) {
			
			arr2[i] = arr1[i];
			
		}
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Copied Array : ");
		System.out.println(Arrays.toString(arr2));
	}

}

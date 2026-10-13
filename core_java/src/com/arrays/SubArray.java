package com.arrays;

public class SubArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 3, 7, 9, 2};
		
	for(int i =0; i < arr.length;i++) {
		for(int j = i ; j < arr.length;j++) {
			for(int k = i; k<=j;k++) {
				System.out.print(arr[k]+" ");
				
			}
			System.out.println();
		}
	}
	}

}

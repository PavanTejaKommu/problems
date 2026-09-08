package com.arrays;

public class DiffFirstLast {
	public static void main(String[] args) {
		int arr [ ] = {10 , 20 , 32 , 23 , 45, 67, 78, 93, 90};
		int difference =0;
		if(arr[0] > arr[arr.length-1]) {
		
		difference = 	arr[0] - arr[arr.length-1];
		}else {
			difference = arr[arr.length-1] - arr[0];
		}
		
		System.out.println("Difference : "+difference);
	}

}

package com.arrays;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
//		int  arr[] = {12, 31, 45,32,75,90,54,38};
		int arr[] = {1,2,3,4,5,6,7,8,9,};
		
		for(int i =0; i< arr.length;i++) {
			boolean flag = false;
			for(int j =0; j< arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == true) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}

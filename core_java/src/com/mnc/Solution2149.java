package com.mnc;

import java.util.Arrays;

public class Solution2149 {

	public static void main(String[] args) {
		// leetcode 2149 Rearrangements of an array 
		int arr[] = { 3,1,-2,-3,2,-4};
		int[] arr2 = new int [arr.length];
		int positiveIndex=0;
		int negativeIndex=1;
		for(Integer i : arr) {
			if(i>0) {
				arr2[positiveIndex] = i;
				positiveIndex+=2;
			}else {
				arr2[negativeIndex] = i;
				negativeIndex+=2;
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		

	}

}

package com.leetcode;

import java.util.Arrays;

public class Solution_1840 {
	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		int sum =0;
		int arr[] = new int [nums.length];
		
		for(int i =0; i <nums.length;i++) {
			sum+=nums[i];
			arr[i] = sum;
		}
		System.out.println(Arrays.toString(arr));
		
		
		/*
		 * for(Integer val : nums){
        sum+=val;
        nums[i]=sum;
        i++;
    }
		 * 
		 */
		
		
	}

}

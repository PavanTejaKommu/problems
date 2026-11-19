package com.mnc;

import java.util.Arrays;

public class Solution_238 {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4};
		
		int left [] = new int [nums.length];
		int prefix=1;
		
		for(int i =0; i < nums.length;i++) {
			left[i] = prefix;
			prefix*=nums[i];
		}
		
		int right[] = new int[nums.length];
		int suffix=1;
		for(int i=nums.length-1;i>=0;i--) {
			right[i] = suffix;
			suffix*=nums[i];
		}
		
		int res[] = new int[nums.length];
		for(int i =0;i<nums.length;i++) {
			res[i] = left[i] * right[i];
		}
		
		System.out.println(Arrays.toString(res));
	}

}

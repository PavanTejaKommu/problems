package com.leetcode;

public class Solution26 {

	public static void main(String[] args) {

		//int [] nums = {0,0,1,1,1,2,2,3,3,4};
		int [] nums = {1,1,2};
		
		int count =0;
		for(int i =0; i < nums.length;i++) {
			
			int temp =0;
			
			for(int j =i+1;j < nums.length;j++) {
				
				if(nums[i] == nums[j]) {
					
					System.out.println(nums[i]);
					
					temp++;
					
				}
			}
			if(temp >= 1) {
				count++;
			}
			
		}
		System.out.println("Count : "+count);
		System.out.println((nums.length)-(count));
	}

}

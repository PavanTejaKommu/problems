package com.leetcode;

public class Solution_1295 {
	public static void main(String[] args) {
		int nums[] = {12,345,2,6,7896};
		int count=0;
		for(int i =0;i<nums.length;i++){
		    int temp =0;
		    while(nums[i] !=0){
		temp++;
		nums[i]/=10;
		    }
		    if(temp%2 ==0){
		        count++;
		    }
		}
		System.out.println(count);
	}

}

package com.leetcode;

public class Solution_1672 {
	public static void main(String[] args) {
		int nums[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
		int maxWealth =0;
		for(int i=0;i<nums.length;i++) {
			int max = 0;
			for(int j=0;j<nums[i].length;j++) {
				max+=nums[i][j];
			}
			if(max> maxWealth) {
				maxWealth = max;
			}
		}
System.out.println(maxWealth);
	}
}

package com.mnc;

import java.util.HashMap;

public class Solution_1 {
	public static void main(String[] args) {
		
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<nums.length;i++) {
			int temp = target - nums[i];
			if(map.containsKey(temp)) {
				System.out.println(i+" "+map.get(temp)+"");
				 break;
			}else {
				map.put(nums[i], i);
			}
		}
		
		System.out.println("***");
		
	}

}

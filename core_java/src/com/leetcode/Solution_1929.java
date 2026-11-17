package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_1929 {
	public static void main(String[] args) {
		
		int[] nums = new int[]{1, 3, 2, 1};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(Integer i : nums) {
			al.add(i);
		}
		for(Integer i : nums) {
			al.add(i);
		}
		int arr[] = new int[nums.length*2];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = al.get(i);
		}
        int index=0;
//        while(index<arr.length){
//
//            if(index > nums.length-1){
//                index=0;
//            }
//             for(int i=0;i<nums.length;i++){
//            arr[i] = nums[i];
//            index++; 
//             }
//             
//        }
        System.out.println(al);
        System.out.println(Arrays.toString(arr));
	}

}

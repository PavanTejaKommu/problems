package com.leetcode;

public class RemoveDuplicatesfromSortedArray_26 {
	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		
		int count =arr.length;
		
		for(int i =1; i < arr.length;i++) {
			boolean flag = false;
			for(int j =i+1 ; j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					count--;
				}
				
			}
		}
		System.out.println("count : "+count);
	}

}

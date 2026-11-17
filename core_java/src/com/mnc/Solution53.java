package com.mnc;

public class Solution53 {
	public static void main(String[] args) {
		int arr[] = { 5,4, -1, 7,8};
		int maxSum = Integer.MIN_VALUE;
		
		int currentSum=arr[0];
		
		
		
		for(int i=1;i<arr.length;i++) {
			currentSum = Math.max(arr[i], currentSum+arr[i]);
			maxSum = Math.max(maxSum, currentSum);
			
		}
		System.out.println(maxSum);
		
//		for(int i =0;i<arr.length;i++) {
//			int sum =0;
//			for(int j=i;j<arr.length;j++) {
//				
//				sum+=arr[j];
//			}
//			if(sum > maxSum) {
//				maxSum = sum;
//			}
//		}
//		System.out.println(maxSum);
	}

}

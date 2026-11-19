package com.mnc;

import java.util.Arrays;

public class Solution_283 {

	public static void main(String[] args) {
		
	int nums[] = {1,2,3,4,5,6,3,2};

	    	int left[] = new int[nums.length];
	    	int prefix =1;
	    	for(int i=0;i<nums.length;i++){
	    	    left[i] = prefix;
	    	    prefix*=nums[i];
	    	}
	    	int suffix =1;

	    	for(int i = nums.length-1;i>=0;i--){
	    	    left[i] = suffix * left[i];
	    	    suffix*=nums[i];
	    	}

	    System.out.println(Arrays.toString(left));


	    	// int left [] = new int [nums.length];
//	    	 		int prefix=1;
	    			
//	    	 		for(int i =0; i < nums.length;i++) {
//	    	 			left[i] = prefix;
//	    	 			prefix*=nums[i];
//	    	 		}
	    			
//	    	 		int right[] = new int[nums.length];
//	    	 		int suffix=1;
//	    	 		for(int i=nums.length-1;i>=0;i--) {
//	    	 			right[i] = suffix;
//	    	 			suffix*=nums[i];
//	    	 		}
	    			
//	    	 		int res[] = new int[nums.length];
//	    	 		for(int i =0;i<nums.length;i++) {
//	    	 			res[i] = left[i] * right[i];
//	    	 		}

//	    	          return res;





	    	        // int arr[] = new int[nums.length];

	    	    //     for(int i=0;i<nums.length;i++){
	    	    //         int product =1;
	    	    //         for(int j =0; j<nums.length;j++){
	    	    //             if(i != j){
	    	    //                 product*=nums[j];
	    	    //             }
	    	    //         }
	    	    //         arr[i] = product;
	    	    //     }
	    	    //    return arr; 

	}

}

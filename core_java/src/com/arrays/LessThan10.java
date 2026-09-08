package com.arrays;

public class LessThan10 {

	public static void main(String[] args) {
		
		int count =0;
		int arr [] = {23, 10 , 44 , 54 , 67 , 98 , 39 , 29 , 9  , 3 , 5};
		for(int i =0 ; i < arr.length;i++) {
			if(arr[i] <  10) {
				count++;
			}
		}
		
		
System.out.println("Leass Than 10 : "+count);
	}

}

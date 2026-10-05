package com.arrays;

public class Program10 {
	public static void main(String[] args) {
		int arr [] = {1,2,3,1,5,7,5,3,4,9 , 2 ,9};
		
		for(int i =0; i < arr.length;i++) {
			for(int j = i +1 ; j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate value : "+arr[i]);
				}
			}
		}
	}

}

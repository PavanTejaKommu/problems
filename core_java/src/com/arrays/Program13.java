package com.arrays;

import java.util.Arrays;

public class Program13 {
	public static void main(String[] args) {
		int arr[] = { 10,0,20,0,30,40,0};
		
		int left = 0;
		int right = arr.length-1;
		
		int index =0;
		
		
		int j =0;
		for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
		
		System.out.println(Arrays.toString(arr));

		
		for(int i =0; i < arr.length;i++) {
			
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index++;
				
				arr[arr.length-1] = 0;
			}
		}
		
			System.out.println(Arrays.toString(arr));
			
		}
	}



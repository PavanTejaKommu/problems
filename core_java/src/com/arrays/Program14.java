package com.arrays;

import java.util.HashSet;

public class Program14 {

	public static void main(String[] args) {


		int arr[] = { 10,0 ,3, 4,20,0,30,40,0, 9,9,3};

		HashSet<Integer> set = new HashSet<>();

		for(int i =0; i < arr.length;i++) {

			if(set.contains(arr[i])) {

				System.out.println(arr[i]);

			}
			if( ! set.contains(arr[i]))
				set.add(arr[i]);

		}
		System.out.println(set);
	}

}

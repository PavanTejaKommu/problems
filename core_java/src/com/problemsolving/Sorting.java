package com.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 2, 1, 1, 0, 1 };
		int zeros=0;
		int ones = 0;
		int twos=0;
		
		for(int i =0; i < arr.length;i++) {
			if(arr[i]==0) {
				zeros++;
			}else if(arr[i] ==1) {
				ones++;
			}else if(arr[i] ==2) {
				twos++;
			}
		}
		
		System.out.println("zeros : "+zeros);
		System.out.println("ones : "+ones);
		System.out.println("twos : "+twos);
		int arr2[] = new int [zeros + ones + twos];
		
		System.out.println("arr2 size : "+arr2.length);
		int index =0;
		
		System.out.println(Arrays.toString(arr2));
		while(index < zeros) {
			System.out.println("Index : "+index);
			arr2[index] = 0;
			index++;
		}
		System.out.println("After 0 ");
		System.out.println(Arrays.toString(arr2));
		while(index < ones + zeros) {
			System.out.println("Index : "+index);

			arr2[index] = 1;
			index++;
		}
		System.out.println("After 1 ");
		System.out.println(Arrays.toString(arr2));
		while(index < (twos +(zeros + ones))) {
			arr2[index] = 2;
			index++;
		}
		
		System.out.println("After 2 : ");
		System.out.println(Arrays.toString(arr2));
		
		
		
		System.out.println("-------------------------------------");
		int arr3 [] = {1 , 2, 0, 2,1,2,0,1};
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int integer : arr3) {
			al.add(integer);
		}
		al2.add(null);
		al2.add(null);
		al2.add(null);
		
		System.out.println(al);
		
		for(int i =0; i < al.size();i++) {
			
			if(al.get(i) == 0) {
				al2.add(0,0);
			}else if (al.get(i) == 1) {
				al2.add(1,1);
			}else if(al.get(i) == 2) {
				al2.add(2,2);
			}
		}
		al2.remove(null);
		al2.remove(null);
		al2.remove(null);
		
		
		System.out.println(al2);
	}

}

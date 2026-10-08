package com.strings;

import java.util.Arrays;

public class Example11 {

	private String arr[];


	public Example11(String[] arr) {
		super();
		this.arr = arr;
	}


	public String[] getArr() {
		return arr;
	}


	public void setArr(String[] arr) {
		this.arr = arr;
	}


	public void isCollection() {
		String arr2 [] = new String [arr.length];
		
		for(int i =0; i < arr.length;i++) {
			arr2[i] = arr[i];
			
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Array 2 : "+Arrays.toString(arr2));

		for(int i =0;i < arr.length;i++) {
			char temp[] = arr[i].toCharArray();

			Arrays.sort(temp);

			arr[i] = new String(temp);


		}
		
		
		for(int i =0; i < getArr().length;i++) {
			
			for(int j = i+1; j < getArr().length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr2[i]+"  --  "+arr2[j]);
				}
			}
		}
		
		System.out.println( "Array 2 : "+Arrays.toString(arr2));


	}


	public static void main(String[] args) {

		String arr [] = {"listen", "silent", "hello", "world", "below", "elbow"};
		Example11 example = new Example11(arr);
		example.isCollection();

	}

}

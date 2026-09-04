package com.arrays;

import java.util.ArrayList;

public class Arrays {

	public void one() {
		int arr[] = new int [3];

		arr[0] = 10;
		arr[1]=20;
		arr[2] = 30;

		for(int i =0 ; i< arr.length;i++) {
			System.out.print(", "+arr[i]+",");
		}

	}
	
	
	

	public void two() {
		String arr[] = new String[4];
		arr[0] = "John";
		arr[1] = "alice";
		arr[2] = "Bob";
		arr[3] = "Emma";

		for(String s : arr) {
			System.out.print(" "+s+",");
		}
	}

	
	
	
	public void three() {

		double arr[] = new double[3];
		arr[0] = 10.5;
		arr[1] = 20.75;
		arr[2] = 30.25;


		for(int i =0 ; i < arr.length;i++) {
			System.out.print(" "+arr[i] + ",");

		}
	}

	

	public void four() {
		int array[] = {29,20,30};
		char arr3[] = new char[5];
		arr3[0] = 'A';
		arr3[1] = 'B';
		arr3[2] = 'C';
		arr3[3]  = 'D';
		arr3[4] = 'E';
		

		for(char cdf : arr3) {
			System.out.print(" "+cdf+",");
		}


		
	}


	public void five() {
		boolean arr[] = new boolean [2];

		arr[0] = true;
		arr[1] = false;
		for(int i =0; i < arr.length;i++) {
			System.out.print(" "+arr[i]+",");
		}



	}
	
	

	public void six() {
		int arr[] = new int [5];

		arr[0] = 5 ;
		arr[1] =  15;
		arr[2] = 25 ;
		arr[3] = 35 ;
		arr[4] = 45 ;

		for(int n : arr) {
			System.out.print(" "+n+",");
		}

	}

	public void seven() {
		String arr[] = new String [3];

		arr[0] = "Delhi";
		arr[1] = "Mumbai";
		arr[2] = "Chennai";

		for(int i =0;i< arr.length;i++) {
			System.out.print(" "+arr[i]+",");
		}

	}

	public void eight() {
		float arr [] = new float[4];

		arr[0] = 1.1f;
		arr[1] =  2.2f;
		arr[2] = 3.3f;
		arr[3] = 4.4f;

		for(float F : arr) {
			System.out.print(" "+F+",");
		}

	}

	public void nine() {
		long arr[] = new long[3];


		arr[0] = 100000L;
		arr[1] = 200000L;
		arr[2] = 300000L;

		for(int i =0; i < arr.length;i++) {
			System.out.print(" "+arr[i]+",");
		}

	}


	public void ten() {
		short arr[] = new short[4];

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;


		for(int i : arr) {
			System.out.print(" "+i+",");
		}
	}

	public  static void breaking() {
		System.out.println();
		System.out.println("*************");

	}
	
	
	public void duplicate() {
		int arr[]= {1,2,34,32,23,87,45,64,30};
		
		ArrayList< Integer> al = new ArrayList<>();
		
		
		
		for(int i =0; i< arr.length;i++) {
			
			if(al.contains(arr[i])) {
				
			}else {
		al.add(arr[i]);
			}
		}

		
		System.out.println(al);
		
		
		
	}


	public static void main(String[] args) {

		Arrays as = new Arrays();
		as.one();
		breaking();
		as.two();
		breaking();
		as.three();
		breaking();
		as.four();
		breaking();

		as.five();
		breaking();
		as.six();
		breaking();
		as.seven();
		breaking();
		as.eight();
		breaking();
		as.nine();
		breaking();
		as.ten();
		
		System.out.println();
		as.duplicate();




	}

}

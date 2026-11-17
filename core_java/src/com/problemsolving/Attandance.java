package com.problemsolving;

public class Attandance {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 1, 0, 1, 1, 1, 0, 1};
		int present =0;
		int absent = 0;
		for(int i =0; i < arr.length;i++) {
			if(arr[i] == 1) {
				present++;
			}else {
				absent++;
			}
		}
		System.out.println("Present : "+present);
		System.out.println("Absent : "+absent);
	}
}

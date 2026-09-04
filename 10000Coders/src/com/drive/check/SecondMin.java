package com.drive.check;

public class SecondMin {

	public int checkMin(int arr[]) {

		int firstMin = arr[0];
		int secondMin = arr[1];



		for(int i=0;i< arr.length;i++) {
			if(arr[i] < firstMin) {
				firstMin = arr[i];
			}
		}


		for(int i =0;i< arr.length;i++) {
			if(arr[i] > firstMin) {
				secondMin = arr[i];
				break;
			}
		}

		for(int i =0;i< arr.length;i++) {
			if(arr[i] > firstMin && arr[i] < secondMin) {
				secondMin = arr[i];
			}

		}

		return secondMin;

	}

	public static void main(String[] args) {

		int arr1[] = {
				11,2,3,46,8,12,
		};


		int arr2[] = {10, 5, 8, 3, 6};


		SecondMin s = new SecondMin();
		System.out.println(	s.checkMin(arr1));

	}



}

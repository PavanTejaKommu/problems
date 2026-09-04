package com.example;

import java.util.Arrays;

public class DuplicationRemove {
	public void removeDuplicate(int arr[]) {
		String str="";
		for(int i =0;i< arr.length;i++) {

			int temp = arr[i];
			int count=0;

			for(int j=0;j<arr.length;j++) {
				if(temp == arr[j]) {

					count++;
				}
			}

			
			if(count > 1) {
				str +=" "+ arr[i];
				break;
			}else if(count == 1) {

				str +=" "+ arr[i];
			}

		}

		System.out.println("Unique : "+str);
	}

	public static void main(String[] args) {
		int arr[] = {
				1,2,3,3,4,5,5
		};
		DuplicationRemove dp = new DuplicationRemove();
		dp.removeDuplicate(arr);
	}
}



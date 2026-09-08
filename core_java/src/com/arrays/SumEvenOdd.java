package com.arrays;

public class SumEvenOdd {

	public static void main(String[] args) {
		
		int arr[] = {10 ,15 ,20 ,25 ,30};
		int evenSum =0;
		int oddSum =0;
		
		
		for(int i =0 ; i< arr.length;i++) {
			
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			}else  if (arr[i ] % 2 !=0){
				oddSum += arr[i];
			}else {
				
			}
		}
		
System.out.println("Even Sum : "+evenSum);
System.out.println("Odd Sum : "+oddSum);
		
	}

}

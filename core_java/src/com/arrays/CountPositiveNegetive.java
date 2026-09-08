package com.arrays;

public class CountPositiveNegetive {
	
	public static void main(String[] args) {
		
		
		
		int arr[] = { 10 ,-5 ,0 ,20 ,-8, 0};
		
		
		int countPositive =0;
		int countNegative = 0; 
		int countZero = 0;
		
		for(int i =0; i < arr.length;i++) {
			if(arr[i] > 0) {
				countPositive ++;
				
				
			} else if(arr[i] < 0){
				countNegative++;
			}
			 else if (arr[i] ==0) {
				countZero++;
			}
		}
		
		System.out.println("Positive : "+countPositive+"\nNegative : "+countNegative+"\nZero :  "+countZero );
		
	}

}

package com.arrays;

public class Program7 {
	public static void main(String[] args) {
		
int arr[][] = {
				
				{6,7,2},
				{3,4,1},
				{9, 11 , 3}
				
		};



for(int i =0; i < arr.length;i++) {
	for(int j =0; j < arr.length;j++) {
		
		if(j > i) {
			int temp = arr[j][i];
			arr[j] [i] = arr[i][j];
			arr[i][j] = temp;
		}
	}
	
}


for(int i =0; i < arr.length;i++) {
	for(int j =0; j < arr.length;j++) {
		
	System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	}
	





		
	}

}

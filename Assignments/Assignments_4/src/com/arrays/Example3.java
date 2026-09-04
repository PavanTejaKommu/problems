package com.arrays;

public class Example3 {
	public static void main(String[] args) {
		// duplicate 
		// unique 
		
		
		int arr[] = {10,20,30,20,40,10};
		
		
		//Number repeat how many  use hash map if we gone through the colletions
		for(int i =0;i<arr.length;i++) {
			boolean flag = false;
			
			for(int j =0; j < i;j++) {
				if(arr[i] == arr[j]) {
					flag = true;
					break;
					
				}
			}
			
			if(flag == false) {
				
				int count =0;
				for(int j =0; j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					
				}
				
			}
				System.out.println(arr[i] + "-> "+count);
			
			
			
			
			
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Unique iteme after removind duplicate 
		
//		for(int i =0; i< arr.length;i++) {
//			boolean flag = false;
//			int count =0;
//			for(int j =0;j < i ;j ++) {
//				if(arr[i] == arr[j]) {
//					count++;
//					flag = true;
//					break;
//				}
//			}
//			if(flag == false && count == 0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i =0;i < arr.length;i++) {
//			
//			boolean flag = false;
//			
//			for(int j =0;j<i;j++) {
//				if(arr[i] == arr[j]) {
//					flag = true;
//					
//				}
//			}
//	
//			if(flag == false) {
//				System.out.print(arr[i]+" ");
//				
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0 ; i < arr.length;i++) {
//			int count =0;
//			for(int j =i+1; j < arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					count++;
//				}
//				
//			}
//			if(count == 0) {
//				System.out.println(arr[i]+" ");
//			}
//		}
		
		
		
	}

}

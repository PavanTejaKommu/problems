package com.arrays;

public class Program11 {
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,1,5,7,5,3,4,9 , 2 ,9};

		
		for(int i =0; i < arr.length;i++) {
			boolean flag = false;
			
			for(int j = i+1 ; j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					flag = true;
				}
			}
			if(!flag) {
				System.out.println(arr[i]);
			}
		}
		
		
		
		String str = "madam";
		String reversed = "";
		for(int i =str.length()-1; i >= 0;i--) {
			char ch = str.charAt(i);
			reversed = reversed + ch;
		}
		System.out.println(reversed);
		
		
		
		if(str.equals(reversed)) {
			System.out.println("It is an palindrome ");
		}else {
			System.out.println("It is not an palindrome ");
		}
	}

}

package com.leetcode;
import java.util.*;
public class Solution1 {
	public boolean isPalindrome(int x) {
		int original = x;
		int reversed =0;
		while(x > 0){
			int temp = x % 10;
			reversed = reversed * 10 + temp;
			x=x/10;
		}
		System.out.println("Reversed : "+reversed);
		
		
		if(original == reversed){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Solution1 s = new Solution1();
		System.out.println(s.isPalindrome(121));
		
		
		
	
		
		
	}

}

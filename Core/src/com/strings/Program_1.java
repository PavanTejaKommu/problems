package com.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program_1 {
	public static void main(String[] args) {
		String str = "abc de fghi jkl mn";
		
		String strarr[] = str.trim().split("\\s");
		System.out.println(Arrays.toString(strarr));
		
		for(int i = strarr.length-1;i>=0;i--) {
			System.out.println(strarr[i].length());
			break;
		}
	}

}

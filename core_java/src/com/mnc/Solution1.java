package com.mnc;

import java.util.ArrayList;

public class Solution1 {
public static void main(String[] args) {
	int arr[] = {0,1,0,3,12};
	
	
	ArrayList<Integer> al0 = new ArrayList<Integer>();
	ArrayList<Integer> al1 =  new ArrayList<Integer>();
	
	for(Integer i : arr) {
		if(i == 0) {
			al0.add(i);
		}else {
			al1.add(i);
		}
	}
	
	
	al1.addAll(al0);
	System.out.println(al1);
}
}

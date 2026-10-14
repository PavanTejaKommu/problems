package com.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ProbLinkedList2 {
	public static void main(String[] args) {
		Integer arr[] = {45, 78, 23, 90, 67, 90, 56, 78};
		int firstMax=0;
		int secondMax=0;
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(Integer n : arr) {
			ll.add(n);
		}
		System.out.println(ll);
		
		for(Integer i : ll) {
			
			if(i > firstMax) {
				secondMax = firstMax;
				firstMax = i;
			}
			
		}
		
		System.out.println("Second Max : "+secondMax);
		Collections.sort(ll);
		System.out.println(ll);
		
	}

}

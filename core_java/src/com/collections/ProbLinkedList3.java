package com.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ProbLinkedList3 {
	public static void main(String[] args) {
		
		List<Integer> ll1 = new LinkedList<>();
		List<Integer> ll2 = new LinkedList<>();
		
		
		List<Integer> common = new LinkedList<>();
		
		int arr1[] = {10,20,30,20,40,50};
		int arr2[] =  {20,30,30,60,40};
		
		
		for (int i : arr1) {
			ll1.add(i);
			
		}
		
		for (int i : arr2) {
			ll2.add(i);
		}
		
		for(int i =0;i < ll1.size();i++) {
			if(ll2.contains(ll1.get(i))) {
				common.add(ll1.get(i));
			}
			
		}
		
		
		System.out.println(common);
		Set<Integer> hs = new HashSet<>();
		hs.addAll(common);
		System.out.println(hs);
		
		
		/*
		 * List 1: [10, 20, 30, 20, 40, 50]
		List 2: [20, 30, 30, 60, 40]
		Create a new ArrayList containing common elements only once.
		Expected:
		[20, 30, 40]

		 */
		
		
	}

}

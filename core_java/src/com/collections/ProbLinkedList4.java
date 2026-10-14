package com.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProbLinkedList4 {
	public static void main(String[] args) {
		
		Integer arr[] = { 1, 2, 3, 5, 6, 8 , 9, 10};
		
		List<Integer> ll1 = new LinkedList<>();
		for (Integer integer : arr) {
			ll1.add(integer);
			
		}
		
		Collections.sort(ll1);
		int val = ll1.get(0);
		for(int i =0; i < ll1.size();i++) {
			
			if(ll1.contains(val)) {
				val++;
			}else {
				System.out.println(val);
			val++;
			}
		}
		
	}

}

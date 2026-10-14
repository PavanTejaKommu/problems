package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProbLinkedList6 {
	public static void main(String[] args) {
		Integer arr[] = { -5, 10, 0, -20, 30 , 0 , 15 , -18};
		List<Integer> positive = new LinkedList<>();
		List<Integer> negative = new LinkedList<>();
		List<Integer> zero = new LinkedList<>();
		
		List<Integer> all = new LinkedList<>();
		
		for (Integer integer : arr) {
			all.add(integer);
			
		}
		
		Iterator<Integer> iterator = all.iterator();
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			
			if(value > 0) {
				positive.add(value);
			}else if(value < 0) {
				negative.add(value);
			}else {
				zero.add(value);
			}
		}
		
		
		System.out.println("Positive List : "+positive);
		System.out.println("Negative List : "+negative);
		System.out.println("Zero List : "+zero);
		
	}

}

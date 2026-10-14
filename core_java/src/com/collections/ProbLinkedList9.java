package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProbLinkedList9 {
	public static void main(String[] args) {
		
		
		Integer arr []  = { 10,20,10,30,20,40,30,50};
		List<Integer> list = new LinkedList<>();
		
		
		for (Integer integer : arr) {
			list.add(integer);
		}
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			
			int val = iterator.next();
			int temp =0;
			for (int i = 0; i < list.size(); i++) {
				int count=0;
				for (int j = 0; j < list.size(); j++) {
					if(list.get(i) == list.get(j)) {
						count++;
					}
					
				}
				
				if(count  > 1) {
					temp = count;
				}
			}
			if(temp  > 1) {
			iterator.remove();
			}
		}
		System.out.println(list);
		
	}

}

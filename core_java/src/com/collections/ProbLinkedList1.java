package com.collections;

import java.util.LinkedList;

public class ProbLinkedList1 {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(20);
		ll.add(40);
		ll.add(10);
		ll.add(50);
		ll.add(30);
		ll.add(20);
		
		
		for(int i =0; i < ll.size();i++) {
			int count =0;
			for(int j = 0;j < ll.size();j++) {
				if(ll.get(i) == ll.get(j)) {
					count++;
				}
			}
			if(count > 1) {
				System.out.println(ll.get(i)+ " Times : "+count);
			}
		}
		System.out.println(ll);
		

		
	}

}

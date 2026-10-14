package com.collections;

import java.util.LinkedList;
import java.util.List;

public class ProbLinkedList8 {
	public static void main(String[] args) {
		Integer arr[] = {10, 20, 10, 30, 20, 40, 30};
		
		List<Integer> list = new LinkedList<>();
		for (Integer integer : arr) {
			list.add(integer);
		}
		
		
		for (int j =0; j < list.size();j++) {
			int count=0;
			for(int i =0; i < list.size();i++) {
				if(list.get(j) == list.get(i)) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println(list.get(j));
				break;
			}
		}
	}

}

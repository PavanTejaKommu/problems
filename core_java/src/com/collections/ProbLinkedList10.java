package com.collections;

import java.util.LinkedList;
import java.util.List;

public class ProbLinkedList10 {
	public static void main(String[] args) {
		Integer arr [] = {2, 4, 3, 5, 7, 8, 1};
		Integer target =9;
		List<Integer> list = new LinkedList<>();
		for (Integer integer : arr) {
			list.add(integer);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(list.get(i) + list.get(j) == target) {
					System.out.println(list.get(i)+" + "+list.get(j)+ " = "+target );
				}
			}
		}
		
	}

}

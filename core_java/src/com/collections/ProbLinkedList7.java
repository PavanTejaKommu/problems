package com.collections;

import java.util.LinkedList;
import java.util.List;

public class ProbLinkedList7 {
	public static void main(String[] args) {
		
		
		Integer arr1 []= { 10,20,30,40,50};
		Integer arr2 [] = { 30, 40 , 60, 70};
		
		List<Integer> l1 = new LinkedList<>();
		List<Integer> l2 = new LinkedList<>();
		for (Integer integer : arr1) {
			l1.add(integer);
		}
		
		
		for (Integer integer : arr2) {
			l2.add(integer);
		}
		
		
			l1.removeAll(l2);
		System.out.println(l1);
	}

}

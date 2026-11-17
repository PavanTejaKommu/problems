package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;




public class Solution21 {

	

	public static void main(String[] args) {
		
		
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
		
		
//		Input: list1 = [1,2,4], list2 = [1,3,4]
//				Output: [1,1,2,3,4,4]
		
		
                   list3.addAll(0, list1);
                   list3.addAll(0, list2);
                   
                   
                   Collections.sort(list3);
                   System.out.println(list3);
		

	}

}

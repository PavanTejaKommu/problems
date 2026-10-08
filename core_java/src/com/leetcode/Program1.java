package com.leetcode;

import java.util.LinkedList;

public class Program1 {
	
	public static void main(String[] args) {

		LinkedList<Integer> ll =new LinkedList<>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);


		int left = 0;
		int right = ll.size()-1;


		while(left != right) {

			if(ll.get(right) == ll.get(ll.size()/2)) {
				int index = ll.get(ll.size()/2);
				System.out.println(ll.get(index));

			}
			left++;
			right--;

		}

		System.out.println(ll.get(ll.size()/2));

	}

}

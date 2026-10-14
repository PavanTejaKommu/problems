package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProbLinkedList5 {
	public static void main(String[] args) {

		Integer arr[] ={ 0,10, 0, 20, 30, 0, 40};

		List<Integer> list = new LinkedList<>();

		for (Integer integer : arr) {
			list.add(integer);
		}
		
		int count =0;

		Iterator<Integer> it = list.iterator();


		while(it.hasNext()) {
			Integer value = it.next();

			if(value == 0) {
				count++;
				it.remove();
			}
		}

		for(int i =0 ; i <= count;i++) {
			list.addLast(0);
		}
		System.out.println(list);

	

	}

}

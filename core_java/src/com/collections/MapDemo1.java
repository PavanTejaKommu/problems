package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		int a =10;
		Map<Integer, String> map = new HashMap<>();

		System.out.println(Arrays.toString(args));

		/*
		 * SortedMap , NavigableMap, -> TreeMap 
		 * comparable  vs comparator:
		 * comparable :
		 * it is an functional inteface 
		 * Which contains only one abstract method
		 * 
		 * it is from java.lang;
		 * abstract method compareTo(ele t1)
		 * -> 
		 * 
		 * 
		 * Compares this object with the specified object
		 *  for order
		 *  
		 *  Return al:
		 *  
		 *  -> negative integer : this object is less than the specified object .
		 *  
		 *  -> zero : this object is equal to the specified object.
		 *  
		 *  -> positive integer :  object is gretaer than the specified object.
		 *  
		 * 
		 * 
		 */
	}

}

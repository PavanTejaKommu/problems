package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Map1 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();

		m.put(101, "Teja");
		m.put(102, "Pavan");
		m.put(103, "Raj");
		m.put(104, "s");
		m.put(105, "N");
		m.put(106, "D");

		Set<Integer> set=m.keySet();
		for (Integer integer : set) {
			System.out.println(integer);
		}

		Set<Entry<Integer, String>> e = m.entrySet();

		for (Entry<Integer, String> entry : e) {
			System.out.println(entry.getKey()+"  ->> " + entry.getValue());

		}
		m.putIfAbsent(101, "N");
		System.out.println(m.size());
		

		System.out.println(m);

	}

}

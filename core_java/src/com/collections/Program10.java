package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program10 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		map.put(12, 30000);
		map.put(45, 50000);
		map.put(67, 90000);
		map.put(45, 70000);
		map.put(12, 30000);
		map.put(12, 30000);
		map.put(12, 30000);
		map.put(12, 30000);
		
	}

}

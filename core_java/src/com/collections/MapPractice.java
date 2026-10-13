package com.collections;
import java.util.*;

public class MapPractice {
	
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		
		Map<Integer, String> n = new Hashtable<>();
		
		hm.put(1, "Teja");
		hm.putIfAbsent(1, "Pvan");
		hm.put(45, null);
		hm.put(23, "Teja");
		hm.put(2, "Mehar Nolan");
		hm.put(100, "Harish Shankar");
		hm.put(5, "Srikanth Odela");
		
		System.out.println(hm);
	
		
	}

}

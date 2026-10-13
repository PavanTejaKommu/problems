package com.collections;

import java.util.ArrayList;

public class Al3 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(32);
		al.add(29);
		al.add(8);
		al.add(3);
		al.add(90);
		al.add(56);
		al.add(33);
		al.add(94);
		al.add(21);
		al.set(5, 100);
		al.remove(7);
		al.contains(500);
		System.out.println(al.get(4));
		System.out.println(al+"\n size : "+al.size());
		al.clear();
		System.out.println(al.isEmpty());
		
	}

}

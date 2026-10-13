package com.collections;

import java.util.ArrayList;

public class Al2 {
	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();
		
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		al.add('F');
		al.set(2, 'Z');
		al.remove(al.getFirst());
		al.set(4, 'X');
		System.out.println("index 3 : "+al.get(3));
		System.out.println("size : "+al.size());
		al.clear();
		System.out.println("Is empty : "+al.isEmpty());
		
	}

}

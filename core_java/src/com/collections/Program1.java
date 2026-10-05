package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Program1 {

	public static void main(String[] args) {

		LinkedList< Integer> ll = new LinkedList<>();

		ll.add(23);
		ll.add(34);
		ll.addFirst(45);
		ll.addLast(78);
		ll.get(0);
		ll.set(0, 39);

		System.out.println(ll);
		System.out.println("to string : "+ll.toString());

		Stack< Integer> s = new Stack<>();

		s.push(23);
		s.push(45);
		//s.pop();

		System.out.println(s.peek());

		System.out.println(s);

		Vector<Integer> v = new Vector<>();
		v.add(23);
		v.insertElementAt(45, 1);
		v.insertElementAt(90, 2);
		v.set(0, 56);

		System.out.println(v);


		for(int num : v) {
			System.out.println(num);
		}

		v.remove(1);



		for(int i =0 ; i < v.size();i++) {
			System.out.println(v.get(i));

		} 

		ArrayList<Integer> al = new ArrayList<>();

		al.add(23);
		al.add(323);
		al.add(243);
		al.add(232);
		al.add(23);
		al.add(234);
		al.add(53);
		al.add(93);

		System.out.println("Index 0 : "+al.get(0));
		System.out.println("First : "+al.getFirst());
		System.out.println("Last : "+al.getLast());
		System.out.println("Get Class : "+al.getClass());
		System.out.println(al.contains(23));



	}

}

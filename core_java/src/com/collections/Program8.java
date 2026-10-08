package com.collections;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Program8 {
	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		SortedSet<Integer> s = new TreeSet<>();
		s.add(45);
		s.add(67);
		s.add(12);
		s.add(34);
		s.add(12);
		s.add(32);
		s.add(15);
		s.add(19);
		s.add(64);
		System.out.println(s);
		System.out.println("First : -> "+s.first()); // lowest Number
		System.out.println(s.last()); // Highest Number
		System.out.println(s.headSet(34)); // 34 becomes head
		System.out.println(s.tailSet(32)); //from back to 19
		
		
		System.out.println("****************************");
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(10);
		ns.add(20);
		ns.add(30);
		ns.add(40);
		ns.add(60);
		ns.add(80);
		ns.add(100);
		
		System.out.println(ns);
		System.out.println(ns.ceiling(45));
		System.out.println(ns.floor(60)); // second larget 
		System.out.println(ns.higher(40)); //  less than the next value 
		System.out.println(ns.first());
		System.out.println(ns.last());
		System.out.println(ns.tailSet(30, false));
		System.out.println(ns.tailSet(30, true));
		
		
		
		
		
		
		/* HashSet , LinkedHashSet
		 * Sorted order
		 * -> set subinterface 
		 * SortedSet interface , NavigableSet interface 
		 * => TreeSet(class)
		 * 
		 * set(hashSet LinkedHashset, TreeSet .
		 * Map interface -> Hashmap , LinkedHashMap.
		 * 
		 * SortedSet ---------
		 * -> it is an interface which extends Set interface
		 * -> it returns the collection of unique elments /data / sets in a sorted order 
		 * ->SortedSet<Integer> ss = new TreeSet<>();
		 * ->  TreeSet : 
		 * ->TreeSet internally follows Red-black Tree
		 * ->TreeSet returns the assending order.
		 * RBT:=>
		 * -> rootnode must be in black color.
		 * -> every child node does not contain the red.
		 * ->red<-> red.
		 * 
		 * 
		 * NavigableSet:
		 * -> NavigableSet  it is an inteface  it extends SortedSet.
		 * -> It is providing some operations for navigation.
		 * ->  
		 * 
		 * 
		 * =====Map=====
		 * HashSet -> HashMap -> HashTable 
		 * Set -> key values
		 * 
		 */
		
		
		
	}

}

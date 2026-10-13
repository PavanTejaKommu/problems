package com.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	public static void main(String[] args) {
		
		
		//Priority Queue
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(23);
		pq.offer(34);
		pq.add(25);
		pq.add(53);
		pq.add(78);
		pq.add(90);
		pq.add(31);
		pq.add(67);
		pq.add(59);
		pq.add(67);
		System.out.println(pq);
		
		System.out.println("Poll : ==> "+pq.poll());
		System.out.println("Peek : ==> "+pq.peek());
		System.out.println("Remove : ==> "+pq.remove(25));
		System.out.println(pq);
		
		//ArrayDequeue
		Queue<Integer> adq = new ArrayDeque<>();
		
		adq.addAll(pq);
		System.out.println(adq);
		System.out.println("Poll : ==> "+adq.poll());
		System.out.println("Peek : ==> "+adq.peek());
		System.out.println("Remove : ==> "+adq.remove(25));
		System.out.println(adq);
		
		
		//LinkedList
		Queue<Integer> ll = new LinkedList<>();
		
		ll.addAll(adq);
		System.out.println("Linked List : -> "+ll);
		
		System.out.println(adq);
		System.out.println("Poll : ==> "+ll.poll());
		System.out.println("Peek : ==> "+ll.peek());
		System.out.println("Remove : ==> "+ll.remove(25));
		System.out.println("Linked List : -> "+ll);
		
		
		
	}

}

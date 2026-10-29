package com.enums;

import java.util.List;

public class Program3 {

	public static void main(String[] args) {

		// stream API's

		List<Integer> l = List.of(4,5,6,1,8,4,21,32);

		l.stream()
		.filter(t->t%2==0)

		.limit(3) 
		.forEach(System.out::println);
		
		

		//		List<Integer> l = List.of(23,12,67,45,34,78,45,35,34, 3, 2, 9, 76, 45, 31);
		//		//int arr[] = {1,2,3,4,5,6,7,8,9};
		//		//Predicate<Integer> p = (t) -> t%2==0;
		////		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
		////			
		////			@Override
		////			public Integer apply(Integer t) {
		////			
		
		////				return t * t;
		////			}
		////		};
		//	//long l1 =	l.stream()
		//		l.stream()
		
		//		.map(t->t*t)
		//		.distinct()
		//		
		//		.sorted()
		//		//.filter((t) -> t%2==0)
		//		.sorted()
		//		
		//		//.count();
		//	//System.out.println(l1);
		//		.forEach(System.out::println);




		/*15/10/2026
		 * 
		 * What are streems ?
		 * why strems? and how to create a stream?
		 * 
		 * why?
		 * java -8 -> 2014
		 * 
		 * streams -> functional programming -> java.util.function;
		 * 
		 * Arrays , collections  , primitive , builders
		 * data process -> flow process -> stream
		 * -> processingm -> result
		 * 
		 *  source(process) -> intermediate operations -> Terminal operations
		 *  Collections         Filter                        forEach()
		 *  Arrays               distinct                       Count()
		 *  Strings              Map                            Collect()
		 *  Primitives            flatmap, sorted()
		 *                           reduce()
		 * 
		 * streams:
		 *     1.sequencial flow (storing in only heap memory)
		 *     2.parallel flow 
		 * 
		 * 
		 * 
		 * 
		 * 14/10/2026
		 * Inner Classes :
		 * 4 Types 
		 * 1.non static inner class
		 * 2.Static inner class
		 * 3.Local inner class
		 * 4.Anounymous class
		 * 
		 * What is inner class 
		 * how to create inner class?
		 * how  .class file is generated 
		 * 
		 */
		
		
	}

}


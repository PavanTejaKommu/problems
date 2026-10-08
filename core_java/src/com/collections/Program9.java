package com.collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Program9 {
	
 public static void main(String[] args) {
	
	 Map<Integer, String> m = new HashMap<>();
	 m.put(12, "Teja");
	 m.put(13, null);
	 m.put(15, "Pavan");
	 m.put(17, "Niky");
	 m.put(19, "Teja");
	 m.put(12, "Teja");
	 m.put(12, "Teja");
	 m.put(12, "Teja");
	 System.out.println(m);
	 System.out.println(m.getOrDefault(90, "Not Found"));
	 System.out.println(m.get(15));
	 
	 
	 
	 
	 
 String str = "program";
	 
	 char ch [] = str.trim().toCharArray();
	 
	 Map<String, Integer>  map = new HashMap<>();
	 
	/* for(char c : ch) {
		 
		 if(map.containsKey(c)) {
			 
			 map.put(c, map.get(c)+1);
			 
		 }else {
			 map.put(c, 1);
		 }
	 }
	 */
	 
	 System.out.println(map);
	 
	 
	 
	 
	 
	 
	 /*
	  * LinkedHashMap ----
	  * -> for removing duplicates hashing -> hashtable
	  * -> for insertion order internal double linkedList
	  * -> the objects are stored in key-value , pairs.
	  * 
	  * 
	  * Weakhashmpa-->
	  * 
	  * HashMap m = new HashMap();
	  * ->WeakReferences : ->
	  * weak hashmap has weakest reference to its keys so garbage collector can easily collect it.
	  * 
	  * ConcurrentHashMap:
	  * 
	  * -> concurrent modification exception while an loop iteration modifying the data 
	  *  ->
	  * 
	  */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}

}

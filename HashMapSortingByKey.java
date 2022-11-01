package com.collection.logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingByKey {
	
	 public static void main(String args[]) {
	        
		    
		    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		 
		    
		    hashmap.put(22,"R");
		    hashmap.put(55,"I");
		    hashmap.put(33,"T");
		    hashmap.put(44,"E");
		    hashmap.put(99,"S");
		    hashmap.put(88,"H");
		 
		    System.out.println("Before Sorting:");
		    Set set = hashmap.entrySet();
		    Iterator iterator = set.iterator();
		    while(iterator.hasNext()) {
		        Map.Entry pair = (Map.Entry)iterator.next();
		        System.out.print(pair.getKey() + ": ");
		        System.out.println(pair.getValue());
		    }
		    Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);     System.out.println("After Sorting:");
		    Set set2 = map.entrySet();
		    Iterator iterator2 = set2.iterator();
		    while(iterator2.hasNext()) {
		        Map.Entry pair = (Map.Entry)iterator2.next();
		        System.out.print(pair.getKey() + ": ");
		        System.out.println(pair.getValue());
		    } 
		  }

}

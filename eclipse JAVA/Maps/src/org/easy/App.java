package org.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
//		Sequence of Map is not predictable as it show different sequence at different times
		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(3, "Azad");
		student.put(1, "Mia");
		student.put(2, "Chaand");
		student.put(4, "Rakesh");
		student.put(6, "Zenith");
		student.put(5, "Jojo");
		
//		1st way to Traverse the Map 
		/*
		 * for (Map.Entry<Integer, String> entry : student.entrySet()) {
		 * System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		 * }
		 */
		
//		2nd way to traverse the Map (Using ForEach)
		/*
		 * for(int key : student.keySet()) { System.out.println("Key: " + key +
		 * " Value: " + student.get(key)); }
		 */
		
//		Traversing using Iterator (1st way)
		Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
		Entry<Integer, String> temp = entry.next();
		while(entry.hasNext()) {
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue() );
		}
		
//		System.out.println(student.get(3));
		
		

	}

}

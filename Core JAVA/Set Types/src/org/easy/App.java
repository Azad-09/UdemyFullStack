package org.easy;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
//		HashSet will sort the elements in random orders 
//		LinkedHashSet will sort the elements in the order in which they are added
//		TreeSet will add the elements in natural order (A,B,C in alphabets) (1,2,3 in numbers)
		Set<String> set = new HashSet<String>();
		
		for(int i = 30; i>0; i-- ) {
			set.add("A" + i);
		}
		
		for (String integer : set) {
			System.out.println(integer);
		}
	}

}

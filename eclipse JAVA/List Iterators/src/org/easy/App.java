package org.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
	
	public static void main(String[] args) {
		List<String> countryList = new LinkedList<String>();
		countryList.add("India");
		countryList.add("Brazil");
		countryList.add("Russia");
		countryList.add("Egypt");
		countryList.add("Thailand");
		
		new App().printList(countryList);
		
		countryList.sort(null);  // It will sort the elements in albhabetical order
		
		new App().printList(countryList);
		
		// Collections is the parent class of List and used to get reverese list
		Collections.reverse(countryList);
		
		new App().printList(countryList);
		
		
	}
	
	void printList(List<String> list) {
//		ListIterator is used to traverse the "List Interface" which include LinkedList ArrayList etc
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {   // hasNext() will give boolean value whether avialable or not
			System.out.println("Elements: " + iterator.next());
		}
		System.out.println("*****************");
	}
}

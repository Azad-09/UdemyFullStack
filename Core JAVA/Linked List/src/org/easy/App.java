package org.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		LinkedList<String> countryList = new LinkedList<String>();
		countryList.add("India");
		countryList.add("Brazil");
		countryList.add("Russia");
		countryList.add("Egypt");
		countryList.add("Thailand");
		countryList.add("Itaaly");
		
		List<String> demo = new ArrayList<String>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		
		new App().printList(countryList);
//		add using index number
		countryList.add(1, "Canada");
		new App().printList(countryList);
		countryList.set(6, "Italy");
		new App().printList(countryList);
//		FIFO(First in first out) So it will remove the first element 
		countryList.remove();
		new App().printList(countryList);
		countryList.remove(3);
		new App().printList(countryList);
		new App().printList(demo);
		

	}
	
	void printList(List<String> country) {
		for(String elements: country) {
			System.out.println("Elements: " + elements);
		}
		System.out.println("****************");
	}

}

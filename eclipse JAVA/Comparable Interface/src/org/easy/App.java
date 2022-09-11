package org.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


class Names implements Comparable<Names>{
	private String name;
	
	public Names(String name) {
		
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if(name.length() == obj.name.length()) {
			return 0;
		}else if(name.length() > obj.name.length()) {
			return 1;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
public class App {

	public static void main(String[] args) {
		List<Names> names = new LinkedList<Names>();
		names.add(new Names("Azad"));
		names.add(new Names("Mia"));
		names.add(new Names("Ed"));
		names.add(new Names("Pinky"));
		
		App app = new App();
		app.printList(names);
		
		Collections.sort(names);
		app.printList(names);
	}
	
	void printList(List<Names> name) {
		ListIterator<Names> liIt = name.listIterator();
		
		while(liIt.hasNext()) {
			System.out.println("Names: " + liIt.next());
		}
		
		System.out.println("***************");
	}

}

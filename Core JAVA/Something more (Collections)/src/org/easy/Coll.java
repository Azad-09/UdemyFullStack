package org.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import java.util.List;
import java.util.Objects;
import java.util.Set;


class Name implements Comparable<Name>{
	private String name;
	
	public Name(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Name obj) {
		return this.getName().compareTo(obj.getName());
	}
	
	
}

public class Coll {

	public static void main(String[] args) {

		/*
		 * Queue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
		 * 
		 * queue.offer(3); queue.offer(7); queue.offer(1); queue.offer(9);
		 * queue.offer(2); queue.offer(8); queue.offer(5);
		 */

		Set<Name> set = new HashSet<Name>();
		set.add(new Name("Chaand"));
		set.add(new Name("Azad"));
		set.add(new Name("Chaand"));
		set.add(new Name("Ankit"));
		set.add(new Name("Radhe"));
		set.add(new Name("Britty"));

		List<Name> list = new ArrayList<Name>();
//		By using addAll(Bulk method) we can put any collections with another Like Queue in List
		list.addAll(set);
		Collections.sort(list);
	

		for (Name name : list) {
			System.out.println(name);
		}
		
		System.out.println(Collections.binarySearch(list, new Name("test")));
	}

}

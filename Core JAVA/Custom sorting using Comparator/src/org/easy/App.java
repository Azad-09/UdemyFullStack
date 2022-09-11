package org.easy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K, V> {
	private K key;
	private V value;

	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public String toString() {
		return "Key: " + getKey() + " Value: " + getValue();
	}
}

public class App {

	public static void main(String[] args) {
		
//		For Value Length
		Comparator<Data<Integer, String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				} else if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				} else
					return 0;
			}

		};

//		For Key
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else
					return 0;
			}
		};

		Set<Data<Integer, String>> set = new TreeSet<Data<Integer, String>>(COMPARE_NAME_LENGTH);

		set.add(new Data<Integer, String>(1, "Mia"));
		set.add(new Data<Integer, String>(2, "Azad"));
		set.add(new Data<Integer, String>(5, "Ranki Bhabhi"));
		set.add(new Data<Integer, String>(11, "Ankit"));
		set.add(new Data<Integer, String>(7, "Ed"));
		set.add(new Data<Integer, String>(3, "Aishwarya"));

		for (Data<Integer, String> data : set) {
			System.out.println(data);
		}

	}

}

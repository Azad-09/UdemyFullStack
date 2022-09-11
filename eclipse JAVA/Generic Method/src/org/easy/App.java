package org.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Data {

//	Generic Method (for List)
	public <E> void printListData(List<E> list) {
		for (E elements : list) {
			System.out.println(elements);
		}
		System.out.println("*************");
	}

//	Generic Method (for Array)
	public <E> void printArrayData(E[] arrayData) {
		for (E elements : arrayData) {
			System.out.println(elements);
		}
		System.out.println("*************");
	}
}

public class App {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();

		list.add("Weekend");
		list.add("Sia");
		list.add("Alec Benjamin");
		list.add("Charlie Puth");
		list.add("Camila Cabelo");
		list.add("Marian Hills");

		Data data = new Data();

		data.printListData(list);

		//////

		List<Integer> intList = new ArrayList<Integer>();

		intList.add(666);
		intList.add(77);
		intList.add(81);
		intList.add(1000);
		intList.add(2342);
		intList.add(7657);

		data.printListData(intList);

		//////

		String[] stringArray = { "Robert Downey JR", "Al Pacho", "Robert DiNiro", "Tom Hanks", "Daniel Craig" };

		data.printArrayData(stringArray);

		/////

		Double[] intArray = { 2.2, 41.12, 8877.88, 908.23, 111.11 };

		data.printArrayData(intArray);
	}
}
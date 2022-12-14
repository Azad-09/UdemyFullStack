package org.easy;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

class Data{
	private String name;
	
	public Data(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<Data>();
		list.add(new Data("Radhe"));
		list.add(new Data("Pinky"));
		list.add(new Data("Happu"));
		list.add(new Data("Ed"));
		list.add(new Data("Justin"));
		
		/*
		 * Collections.sort(list, new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) {
		 * 
		 * return o1.getName().compareTo(o2.getName()); } });
		 */
		
		
		/*
		 * //Lambda Expression for Comparator(Alphabetic Order)
		 * Collections.sort(list,(Data o1, Data o2)->
		 * o1.getName().compareTo(o2.getName()) );
		 */
		
		//If we use braces then we have to use multiple statement and also have to use the return statement
		Collections.sort(list, (Data o1, Data o2)->{
			if(o1.getName().length() < o2.getName().length()) {
				return -1;
			}else if(o1.getName().length() > o2.getName().length()) {
				return 1;
			}else {
				return 0;
			}
		});
		
		
		/*
		 * //Enhanced for loop 
		 * for(Data data: list) { System.out.println(data); }
		 */
		
		list.forEach(var ->{
			if(var.getName().length()> 4) {
				System.out.println(var);
			}
		});
		
		
	}

}

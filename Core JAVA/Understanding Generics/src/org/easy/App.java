package org.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
	private T data;
	
	public Data(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	@Override
	public String toString() {
		return "Data: " + data; 
	}
}
public class App {

	public static void main(String[] args) {
//		Here the generics type for the Generic class is Object so we can store any kind of data type
		List<Data<Object>> typeList = new LinkedList<Data<Object>>();
		typeList.add(new Data<Object>("Some Text"));
		typeList.add(new Data<Object>(23));
		typeList.add(new Data<Object>(23.423f));
		typeList.add(new Data<Object>(57.0d));

		App app = new App();
		app.printList(typeList);
		

	}
	
	public void printList(List<Data<Object>> list) {
		ListIterator<Data<Object>> listIterator = list.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("***********");
	}

}

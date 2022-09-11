package org.easy;

/*
T- Type
E- Element
K- Key
N- Number
V- Value
*/

class Data<K, V>{
	private K key ;
	private V value;
	
	public Data(K key , V value) {
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
		return "Key: " + key + " Value: " + value; 
	}
	
	public <E, N> void display(E element, N number) {
		System.out.println("Element: " + element + " Number: " + number);
	}
}

public class App {

	public static void main(String[] args) {
//		Type Safety is done by mentioning the type of Data Type inside the diamond bracket
		Data<Integer, String> data = new Data<Integer, String>(1, "Radhe");
		
		System.out.println(data);
		
		data.display(32, "Pinky");
		

	}

}

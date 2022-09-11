package org.easy;

class Data<K extends Integer, V extends App> {
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
		return "Key: " + key + " Value: " + value;
	}

//	Bounding the Parameter type in which the element can only be Character type and Number can only be Number type
	public <E extends Character, N extends Number> void display(E elements, N number) {
		System.out.println("Elements: " + elements + " Number: " + number);
	}

}

public class App {

	public static void main(String[] args) {
		Data<Integer, App> data = new Data<Integer, App>(3, new App());
//		System.out.println(data);

		data.display('@', 23.32);

		data.getValue().test();
		System.out.println(data.getKey());

	}

	public void test() {
		System.out.println("Testing.....");
	}

}

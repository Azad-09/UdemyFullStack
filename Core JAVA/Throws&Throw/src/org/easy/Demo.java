package org.easy;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception is running");
		}catch (Exception e) {
			System.out.println("Exception the mother is running!!");
		}

	}

	public static void someMethod() throws Exception {
//		FileReader fr = new FileReader("file.txt");
		System.out.println("Some Method is running");

		throw new Exception();

	}

}

package org.easy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		File directory = new File("d:\\orgEasy\\author\\azad");
		directory.mkdirs();      //mkdirs for multiple directory and mkdir for single directory
		System.out.println("Directory Created!!");
		
		Thread.sleep(2000);
		
		File file = new File("d:\\orgEasy\\author\\azad\\radhe.txt");
		file.createNewFile();
		System.out.println("File Created!!");
	}

}

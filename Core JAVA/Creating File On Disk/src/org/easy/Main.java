package org.easy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//It will provide the file location
		File file = new File("D:\\movie\\ys\\orgEasy.txt");           // absolute path
		File file2 = new File("src/org/radhe.txt");  				 // relative path
		file.createNewFile();
		file2.createNewFile();
		System.out.println("Both file created");
		
	}

}

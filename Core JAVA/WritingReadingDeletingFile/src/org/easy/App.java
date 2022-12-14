
package org.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		File dir = new File("Azad");
		dir.mkdir();
		dir = new File("Azad\\radhe.txt");

		// true is for append in order to avoid override
		// try() with resources is a good practise whenever we use Stream class like Scanner,BufferReader etc.And it is a good practise to close the stream after use
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(dir, true))) {
			bw.write("Azad\nAnkit\nAishwarya\nBharati\nBhagabat\nSiri\n");
			bw.newLine();
			System.out.println("Writing to the txt file is completed");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Writting on txt is not done!!");
		}

		
		/*
		 * try { BufferedReader br = new BufferedReader(new
		 * FileReader("Azad\\radhe.txt")); String line;
		 * System.out.println("***********************"); while ((line = br.readLine())
		 * != null) { System.out.println(line); } br.close(); } catch
		 * (FileNotFoundException e) { System.out.println("FileNotFoundException"); }
		 * catch (IOException e) { System.out.println("IOException"); }
		 */
		
		
		//Scanner class to read file
		try {
			Scanner sc = new Scanner(new File("Azad\\radhe.txt"));
			System.out.println("--------------------------------------");
			while(sc.hasNext()) {
				
				System.out.println(sc.nextLine());
			}
			sc.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File Not Found at the given location!!");
		}
		
		File file = new File("Azad\\radhe.txt");
		if(file.delete()) {
			System.out.println("File is deleted!!");
		}else {
			System.out.println("There is no file to delete");
		}
	}

}

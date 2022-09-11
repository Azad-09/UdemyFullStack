package org.easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("src\\easy\\vehicle.dat")) {
			try(ObjectInputStream obj = new ObjectInputStream(fis)) {
				Vehicle v1 = (Vehicle) obj.readObject();
				Vehicle v2 = (Vehicle) obj.readObject();
				
				System.out.println("Vehicle 1: " + v1);
				System.out.println("Vehicle 2: " + v2);
				
				} catch (ClassNotFoundException e) {
					System.out.println("ClassNotFoundException");
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("IOException");
				e.printStackTrace();
			}
		}
	}



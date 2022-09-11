package org.easy;

import java.util.ArrayList;

public class App {

	public static ArrayList<String> listName = new ArrayList<String>();

	public static void main(String[] args) {

		listName.add("Azad");
		listName.add("Ankit");
		listName.add("Aishwarya");
		listName.add("Sudhasatwa");
		listName.add("Pinky Ji");
		listName.add("Happu Singh");
		listName.add("Radhe");

		App app = new App();
		app.displayListName(listName);
		/*
		 * System.out.println("************"); app.removeNameByPosition(0);
		 * app.displayListName(listName);
		 */

		System.out.println("************");

		/*
		 * app.removeNameByName("Happu Singh"); app.displayListName(listName);
		 * System.out.println("************"); System.out.println(listName.get(2));
		 * app.modifyName(4, "Gori Maam"); app.displayListName(listName);
		 */
		
		int position = app.searchIndexNumber("Pinky Ji");
		
//		System.out.println(position);
		
		if(position != -1) {
			app.modifyName(position, "Emma Watson");
			app.displayListName(listName);
		}else {
			System.out.println("Invalid Entry");
		}

	}

	public void displayListName(ArrayList<String> listName) {
		for (String name : listName) {
			System.out.println(name);
		}
	}

	public void removeNameByPosition(int position) {

		listName.remove(position);
	}

	public void removeNameByName(String name) {
		listName.remove(name);
	}

	void modifyName(int position, String name) {
		listName.set(position, name);
	}

	int searchIndexNumber(String name) {
		return listName.indexOf(name);
	}
}

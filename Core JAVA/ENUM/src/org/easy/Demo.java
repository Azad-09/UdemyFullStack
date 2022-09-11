package org.easy;

public class Demo {
	public static void main(String[] args) {
		Learning learn = Learning.JSPANDSERVELET;
		
		switch(learn) {
		case COLLECTIONS:
			System.out.println("Learning Collections");
			break;
		case COREJAVA:
			System.out.println("Learning Core Java");
			break;
		case GENERICS:
			System.out.println("Learning Generics");
			break;
		case JSPANDSERVELET:
			System.out.println("Learning JSP and Servelet");
			break;
		case MULTITHREADING:
			System.out.println("Learning Multi Threading");
			break;
		default:
			break;
		
		}
	}
}

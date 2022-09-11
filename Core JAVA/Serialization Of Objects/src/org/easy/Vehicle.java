package org.easy;

import java.io.Serializable;

public class Vehicle implements Serializable{
	private String type;
	private int number;
	
	public Vehicle(String type, int number) {
		this.type = type;
		this.number = number;		
	}
	
	public String toString() {
		return "Vehicle Type: " + type + ", Vehicle Number: " + number; 
	}
}

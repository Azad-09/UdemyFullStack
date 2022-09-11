package org.easy.phone;

public class Phone {
	private String model;
	
//	constructor
	public  Phone(String model) {
		this.model = model;
	}
//	Function
	public void features() {
		System.out.println("Featured Phone");
	}
//	Getter
	public String getModel() {
		return model;
	}
	
	
	
}

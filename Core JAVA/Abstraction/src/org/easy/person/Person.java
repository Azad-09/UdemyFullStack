package org.easy.person;

public abstract class Person implements IsAlive, LiveLife {
	
	public String speak() {
		return "He/She can share the feelings";
	}
	
	@Override
	public String breathe() {
		return "Be alive, Remain living"; 
	}
	
	@Override
	public String message() {
		return "Life is a journey, just go with the flow";
	}
	
	public abstract String eat();

}

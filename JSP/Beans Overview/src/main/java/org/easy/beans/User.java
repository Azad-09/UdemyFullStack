package org.easy.beans;

public class User {
	private String firstName;
	private String lastName;
	
	// default constructor
	public User() {
		firstName = "John";
		lastName = "Doe";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}

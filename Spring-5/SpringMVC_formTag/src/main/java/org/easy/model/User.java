package org.easy.model;

public class User {
 private String name , gender;
 
 

public User() {
	
}

public User(String name, String gender) {
	this.name = name;
	this.gender = gender;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "User [name=" + name + ", gender=" + gender + "]";
}
 
 
}

package org.easy.model;

public class User {
 private String name , gender, country;
 
 

public User() {
	
}

public User(String name, String gender, String country) {
	this.name = name;
	this.gender = gender;
	this.country = country;
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

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "User [name=" + name + ", gender=" + gender + ", country=" + country + "]";
}
 
}

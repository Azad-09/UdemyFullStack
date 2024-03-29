package org.easy.model;

import java.util.Arrays;

import javax.validation.constraints.Size;

public class User {
	@Size(min = 3, max = 12)
	private String name; 
	private String gender, country, intro, visitedCountries[];
 
 

public User() {
	
}

public User(String name, String gender, String country, String intro) {
	this.name = name;
	this.gender = gender;
	this.country = country;
	this.intro = intro;
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

public String getIntro() {
	return intro;
}

public void setIntro(String intro) {
	this.intro = intro;
}

public String[] getVisitedCountries() {
	return visitedCountries;
}

public void setVisitedCountries(String[] visitedCountries) {
	this.visitedCountries = visitedCountries;
}

@Override
public String toString() {
	return "User [name=" + name + ", gender=" + gender + ", country=" + country + ", intro=" + intro
			+ ", visitedCountries=" + Arrays.toString(visitedCountries) + "]";
}

}

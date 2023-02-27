package org.easy.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hibernate_user")
public class HibernateUser {
	@Id
	@Column(name = "user_id") // Column name is mandatory as the field name is different from the name in
								// database
	private int userId;

	@Column(name = "username") // Not necessary but for convenience
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

//	Constructor
	public HibernateUser() {

	}

	public HibernateUser(String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	Getter/Setter
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "User_ID: " + userId + " Username: " + username + " Password: " + password + " First Name: " + firstName
				+ " Last Name: " + lastName;
	}

}

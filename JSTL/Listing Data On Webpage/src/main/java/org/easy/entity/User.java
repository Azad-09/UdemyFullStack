package org.easy.entity;

public class User {
	private int user_id;
	private String usr_name;
	private String email;
	
	
	
	public User(int user_id) {
		this.user_id = user_id;
	}



	public User(int user_id, String usr_name, String email) {
		this.user_id = user_id;
		this.usr_name = usr_name;
		this.email = email;
	}
	
	

	public User(String usr_name, String email) {
		this.usr_name = usr_name;
		this.email = email;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsr_name() {
		return usr_name;
	}

	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", usr_name=" + usr_name + ", email=" + email + "]";
	}
	
	
}

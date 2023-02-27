package org.easy.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.easy.entity.User;

public class UserModel {

	public List<User> listUsers(DataSource dataSource) {
		// Step 1: Initialize connection objects
		List<User> listUsers = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			connect = dataSource.getConnection();

			// Step 2: Create a SQL statements string
			String query = "Select * from user";
			stmt = connect.createStatement();

			// Step 3: Execute SQL query
			rs = stmt.executeQuery(query);

			// Step 4: Process the result set
			while (rs.next()) {
				listUsers.add(new User(rs.getInt("user_id"), rs.getString("usr_name"), rs.getString("email")));
			}

		} catch (SQLException e) {
			System.out.println("Facing error while retriving data!!");
			e.printStackTrace();
		}
		return listUsers;
	}

	public void addUser(DataSource dataSource, User newUser) {
		Connection connect = null;
		PreparedStatement statement = null;

		try {
			connect = dataSource.getConnection();
			String username = newUser.getUsr_name();
			String email = newUser.getEmail();
			String query = "insert into user (usr_name,email) values(?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			
		}

	}

	public void updateUser(DataSource dataSource, User updatedUser) {
		Connection connect = null;
		PreparedStatement statement = null;

		try {
			connect = dataSource.getConnection();
			int usersId = updatedUser.getUser_id();
			String username = updatedUser.getUsr_name();
			String email = updatedUser.getEmail();
			String query = "update user set usr_name = ? , email = ? where user_id = ?";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, usersId);
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			
		}

	}

	public void deleteUser(DataSource dataSource , int usersId) {
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			connect = dataSource.getConnection();
			String query = "DELETE FROM user WHERE user_id = ?";
			stmt = connect.prepareStatement(query);
			stmt.setInt(1, usersId);
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	
}

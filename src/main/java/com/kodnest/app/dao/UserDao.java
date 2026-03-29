package com.kodnest.app.dao;

public class UserDao {
	int userId;
	String name;
	String email;
	String role;
	
	public UserDao(int userId, String name, String email, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.role = role;
	}
	
	
}

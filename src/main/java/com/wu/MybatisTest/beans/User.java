package com.wu.MybatisTest.beans;

public class User {
	int id;
	String username;
	String password;
	double account;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	public User(int id, String username, String password, double account) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.account = account;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", account=" + account + "]";
	}
	public User(String username, String password, double account) {
		super();
		this.username = username;
		this.password = password;
		this.account = account;
	}

	
}

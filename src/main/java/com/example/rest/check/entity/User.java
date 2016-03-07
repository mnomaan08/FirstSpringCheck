package com.example.rest.check.entity;

public class User {
	String userName;
	String message;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", message=" + message + "]";
	}


}

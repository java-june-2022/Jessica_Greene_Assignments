package com.codingdojo.loginandregistration.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//Validates input from the login form
public class LoginUser {
	
	@NotBlank(message="Email is required!")
	@Email(message="Please enter a valid email!")
	private String email;
	
	@NotBlank(message="Password is required!")
	@Size(min=8, message="Password must be at least 8 characters!")
	private String password;
	
	public LoginUser() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

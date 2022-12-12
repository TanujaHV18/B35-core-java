package org.tnsindia.customexceptiondemo;
//Custom Exception for validating login
public class Logincredentials extends Exception{
	
	private String id;
	private String password;

	

	public LoginCredentials(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}



	@Override
	public String toString() {
		return "LoginCredentials [id=" + id + ", password=" + password + "]";
	}



	
	
	

}
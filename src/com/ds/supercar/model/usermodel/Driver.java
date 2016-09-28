package com.ds.supercar.model.usermodel;

public class Driver extends User{

	private int licence_number;
	private User user;
	
	public Driver(){
		
	}

	public Driver(int licence_number, User user) {
		super();
		this.licence_number = licence_number;
		this.user = user;
	}

	public int getLicence_number() {
		return licence_number;
	}

	public void setLicence_number(int licence_number) {
		this.licence_number = licence_number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

package com.ds.supercar.model.usermodel;

public class Address {

	private String email=null;
	private String mobile=null;
	private String street=null;
	private String city=null;
	private String state=null;
	private String pin=null;
	
	public Address(){
		
	}
	
	public Address(String email, String mobile, String street, String city, String state, String pin) {
		super();
		this.email = email;
		this.mobile = mobile;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
}

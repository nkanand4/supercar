package com.ds.supercar.model.places;

public class Location {

	private String locationid;
	private String street;
	private String city;
	private String state;
	//private String country;
	private String pin;
	
	public Location(){
		
	}

	public Location(String locationid, String street, String city, String state, String country, String pin) {
		super();
		this.locationid = locationid;
		this.street = street;
		this.city = city;
		this.state = state;
		//this.country = country;
		this.pin = pin;
	}

	public String getLocationid() {
		return locationid;
	}
	public void setLocationid(String locationid) {
		this.locationid = locationid;
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
/*	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
*/
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
}

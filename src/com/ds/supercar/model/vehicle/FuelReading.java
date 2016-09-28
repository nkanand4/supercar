package com.ds.supercar.model.vehicle;

import java.util.Date;

public class FuelReading {
	
	private int fuelreadingid;
	private Car car;
	private Date readingdate;
	private Date readingtime;
	private int reading;
	private int version;
	
	public FuelReading(){
		
	}

	public FuelReading(int fuelreadingid, Car car, Date readingdate, Date readingtime, int reading, int version) {
		super();
		this.fuelreadingid = fuelreadingid;
		this.car = car;
		this.readingdate = readingdate;
		this.readingtime = readingtime;
		this.reading = reading;
		this.version = version;
	}

	public int getFuelreadingid() {
		return fuelreadingid;
	}

	public void setFuelreadingid(int fuelreadingid) {
		this.fuelreadingid = fuelreadingid;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Date getReadingdate() {
		return readingdate;
	}

	public void setReadingdate(Date readingdate) {
		this.readingdate = readingdate;
	}

	public Date getReadingtime() {
		return readingtime;
	}

	public void setReadingtime(Date readingtime) {
		this.readingtime = readingtime;
	}

	public int getReading() {
		return reading;
	}

	public void setReading(int reading) {
		this.reading = reading;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
}

package com.ds.supercar.model.transaction;

import java.util.Date;

import com.ds.supercar.model.payment.Payment;
import com.ds.supercar.model.usermodel.User;

public class CarSellingRecord {

	private int carsaleid;
	private User user;
	private Payment payment;
	private Date dateofsale;
	private CarForSaleRecord carForSaleRecord;
	
	public CarSellingRecord(){
		
	}
	
	
	public CarSellingRecord(int carsaleid, User user, Payment payment, Date dateofsale,
			CarForSaleRecord carForSaleRecord) {
		super();
		this.carsaleid = carsaleid;
		this.user = user;
		this.payment = payment;
		this.dateofsale = dateofsale;
		this.carForSaleRecord = carForSaleRecord;
	}


	public int getCarsaleid() {
		return carsaleid;
	}
	public void setCarsaleid(int carsaleid) {
		this.carsaleid = carsaleid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Date getDateofsale() {
		return dateofsale;
	}
	public void setDateofsale(Date dateofsale) {
		this.dateofsale = dateofsale;
	}
	public CarForSaleRecord getCarForSaleRecord() {
		return carForSaleRecord;
	}
	public void setCarForSaleRecord(CarForSaleRecord carForSaleRecord) {
		this.carForSaleRecord = carForSaleRecord;
	}
	
	
}

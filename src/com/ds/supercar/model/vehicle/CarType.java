package com.ds.supercar.model.vehicle;

public class CarType {
	
	private int cartypeid;
	private String cartypename;
	private String cartype_desc;
	
	public CarType(){
		
	}

	public CarType(int cartypeid, String cartypename, String cartype_desc) {
		super();
		this.cartypeid = cartypeid;
		this.cartypename = cartypename;
		this.cartype_desc = cartype_desc;
	}

	public int getCartypeid() {
		return cartypeid;
	}

	public void setCartypeid(int cartypeid) {
		this.cartypeid = cartypeid;
	}

	public String getCartypename() {
		return cartypename;
	}

	public void setCartypename(String cartypename) {
		this.cartypename = cartypename;
	}

	public String getCartype_desc() {
		return cartype_desc;
	}

	public void setCartype_desc(String cartype_desc) {
		this.cartype_desc = cartype_desc;
	}

}

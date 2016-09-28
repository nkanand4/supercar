package com.ds.supercar.model.payment;

public class InsuranceType {

	private int insurancetypeid;
	private String insurance_descr; //Description
	
	public InsuranceType(){
	}

	public InsuranceType(int insuranceid, String insurance_descr) {
		super();
		this.insurancetypeid = insuranceid;
		this.insurance_descr = insurance_descr;
	}

	public int getInsuranceid() {
		return insurancetypeid;
	}

	public void setInsuranceid(int insuranceid) {
		this.insurancetypeid = insuranceid;
	}

	public String getDescr() {
		return insurance_descr;
	}

	public void setDescr(String descr) {
		this.insurance_descr = descr;
	}
	
}

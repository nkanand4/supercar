package com.ds.supercar.model.places;

public class Branch {

	private String branchid;
	private String name; //branch name
	private String contact_no;
	private String fax_no;
	
	public Branch(){
		
	}
	
	public Branch(String branchid, String location, String contact_no, String fax_no) {
		super();
		this.branchid = branchid;
		this.name = location;
		this.contact_no = contact_no;
		this.fax_no = fax_no;
	}

	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	public String getLocation() {
		return name;
	}
	public void setLocation(String name) {
		this.name = name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getFax_no() {
		return fax_no;
	}
	public void setFax_no(String fax_no) {
		this.fax_no = fax_no;
	}
	
}

package com.ds.supercar.model.transaction;

import java.util.Date;

public class Timesheet {

	private int timesheetid;
	private Date fromdate;
	private Date todate;
	private Date fromtime;
	private Date totime;
	
	public Timesheet(){
		
	}

	public Timesheet(int timesheetid, Date fromdate, Date todate, Date fromtime, Date totime) {
		super();
		this.timesheetid = timesheetid;
		this.fromdate = fromdate;
		this.todate = todate;
		this.fromtime = fromtime;
		this.totime = totime;
	}


	public int getTimesheetid() {
		return timesheetid;
	}

	public void setTimesheetid(int timesheetid) {
		this.timesheetid = timesheetid;
	}

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public Date getFromtime() {
		return fromtime;
	}

	public void setFromtime(Date fromtime) {
		this.fromtime = fromtime;
	}

	public Date getTotime() {
		return totime;
	}

	public void setTotime(Date totime) {
		this.totime = totime;
	}

	
}

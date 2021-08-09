package com.yiibai.common.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class DateTimePickerAction extends ActionSupport{

	private Date date1;
	private Date date2;
	private Date date3;
	
	//return today date
	public Date getTodayDate(){
		
		return new Date();
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public Date getDate3() {
		return date3;
	}

	public void setDate3(Date date3) {
		this.date3 = date3;
	}

	public String execute() throws Exception{
		
		return SUCCESS;
	}

	public String display() {
		return NONE;
	}
	
}
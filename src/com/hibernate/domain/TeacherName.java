package com.hibernate.domain;

import javax.persistence.Embeddable;

@Embeddable
public class TeacherName {
	private String fname;
	private String lname;
	private String mname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "TeacherName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
	}
	
	

}
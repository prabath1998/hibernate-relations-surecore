package com.hibernate.domain;

import javax.persistence.Embeddable;

@Embeddable
public class ParentsName {
	private String parentFname;
	private String parentMname;
	private String parentInitials;
	
	public String getParentFname() {
		return parentFname;
	}
	public void setParentFname(String parentFname) {
		this.parentFname = parentFname;
	}
	public String getParentMname() {
		return parentMname;
	}
	public void setParentMname(String parentMname) {
		this.parentMname = parentMname;
	}
	public String getParentInitials() {
		return parentInitials;
	}
	public void setParentInitials(String parentInitials) {
		this.parentInitials = parentInitials;
	}
	@Override
	public String toString() {
		return "ParentsName [parentFname=" + parentFname + ", parentMname=" + parentMname + ", parentInitials="
				+ parentInitials + "]";
	}
	
	

}

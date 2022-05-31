package com.hibernate.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="lname",column = @Column(name="teacher_lastname")),
		@AttributeOverride(name="fname",column = @Column(name="teacher_firstName")),
		@AttributeOverride(name="mname",column = @Column(name="teacher_middleName"))
	})
	private TeacherName name;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="lname",column = @Column(name="parent_lastname")),
		@AttributeOverride(name="fname",column = @Column(name="parent_firstName")),
		@AttributeOverride(name="mname",column = @Column(name="parent_middleName"))
	})
	private TeacherName parentName;
	
	private String dob;
	private String contactNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public TeacherName getName() {
		return name;
	}
	public void setName(TeacherName name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public TeacherName getParentName() {
		return parentName;
	}
	public void setParentName(TeacherName parentName) {
		this.parentName = parentName;
	}
	
	
	

}

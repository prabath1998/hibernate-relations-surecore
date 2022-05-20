package com.hibernate.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_mto")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	private String name;
	private String address;
	private String contactNo;
	@ManyToOne
	private Class studentClass;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Class getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(Class studentClass) {
		this.studentClass = studentClass;
	}
	
	
	
}

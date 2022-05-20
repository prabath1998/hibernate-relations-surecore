package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branch_otm")
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long branchId;
	private String code;
	private String city;
	private String status;
	@ManyToOne
	private Banks bank;	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Banks getBank() {
		return bank;
	}
	public void setBank(Banks bank) {
		this.bank = bank;
	}		

}

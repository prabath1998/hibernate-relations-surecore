package com.hibernate.manytoone2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long carId;
	private String make;
	private String model;
	@OneToMany(mappedBy = "car")
	private List<Driver> driver = new ArrayList<Driver>();
	
	public List<Driver> getDriver() {
		return driver;
	}
	public void setDriver(List<Driver> driver) {
		this.driver = driver;
	}
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", make=" + make + ", model=" + model + "]";
	}

	
}

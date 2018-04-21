package com.example.demo.dto;

public class DrivingSchoolDTO {

	String name;
	String locality;
	String city;
	String fees;
	public DrivingSchoolDTO(String name, String locality, String city, String fees) {
		super();
		this.name = name;
		this.locality = locality;
		this.city = city;
		this.fees = fees;
	}
	public DrivingSchoolDTO(String name, String fees) {
		super();
		this.name = name;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	
	
}

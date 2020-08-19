package com.example.coding.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NearestPharmacy {
	
	private String name;
	
	@JsonFormat
	private Address address;
	
	private double distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}

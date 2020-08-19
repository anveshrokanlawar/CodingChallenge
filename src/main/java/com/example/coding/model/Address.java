package com.example.coding.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name="Address",nullable = false)
	private String address;
	@Column(name="City",nullable = false)
	private String city;
	@Column(name="State",nullable = false)
	private String state;
	@Column(name="Zipcode",nullable = false)
	private int zipcode;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Address(String address, String city, String state, int zipcode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
}

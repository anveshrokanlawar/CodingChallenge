package com.example.coding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Pharmacies")
public class Pharmacies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pharmacy_ID")
	private long pid;
	
	@Column(name="PharmacyName",nullable=false,length = 70)
	private String name;
	
	private Address address;
	
	@Column(name="Latitude",nullable=false)
	private double latitude;
	
	@Column(name="Longitude",nullable=false)
	private double longitude;

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}

package com.example.coding.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Geodetails implements Serializable{
	
	@Column(name="Latitude",nullable=false)
	private double latitude;
	
	@Column(name="Longitude",nullable=false)
	private double longitude;
	
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

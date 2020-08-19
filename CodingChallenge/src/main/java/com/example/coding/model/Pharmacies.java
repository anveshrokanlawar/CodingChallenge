package com.example.coding.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name="Pharmacies")
public class Pharmacies{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="pharmacy_ID")
//	private long pid;
	
	@Column(name="PharmacyName",nullable=false,length = 70)
	private String name;
	
	@Embedded
	private Address address;
	
	@EmbeddedId
	@Embedded
	private Geodetails location;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Geodetails getLocation() {
		return location;
	}

	public void setLocation(Geodetails location) {
		this.location = location;
	}


}

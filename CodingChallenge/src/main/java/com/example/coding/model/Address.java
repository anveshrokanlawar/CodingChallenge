package com.example.coding.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String address;
	private String city;
	private String state;
	private int zipcode;
	
}

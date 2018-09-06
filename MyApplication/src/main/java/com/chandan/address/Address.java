package com.chandan.address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String country;
	
	protected Address(){}
	
	public Address(String addressLineOne, String addressLineTwo, String city, String country) {
		super();
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.country = country;
	}
}
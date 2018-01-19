package demoApp.address;

import lombok.Data;

@Data
public class Address {
	
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String country;
	
	public Address(String addressLineOne, String addressLineTwo, String city, String country) {
		super();
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.country = country;
	}

}
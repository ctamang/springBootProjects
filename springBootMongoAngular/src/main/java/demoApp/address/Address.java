package demoApp.address;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Address")
public class Address {
	
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
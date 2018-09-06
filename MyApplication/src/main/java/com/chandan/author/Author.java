package com.chandan.author;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.chandan.address.Address;

import lombok.Data;

@Entity
@Data
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ADDRESS_ID", unique=true, nullable=false, insertable=true, updatable=true)
	private Address address;
	private String profession;
	
	protected Author() {
	}

	public Author(final String firstName, final String secondName, final String dateOfBirth,
			  final String profession, Address address) {
		this.firstName = firstName;
		this.lastName = secondName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.profession = profession;
	}
}
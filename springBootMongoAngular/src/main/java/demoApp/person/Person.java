package demoApp.person;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import demoApp.Hobby.Hobby;
import demoApp.address.Address;
import demoApp.course.Course;
import lombok.Data;

@Data
@Document(collection = "Person")
public class Person {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private Address address;
	private String profession;
	private int salary;
	private List<Hobby> hobbies;
	private Course course;
	
	protected Person() {
	}

	public Person(final String firstName, final String secondName, final String dateOfBirth,
			final Address address, final String profession, final int salary, final List<Hobby> hobbies, final Course course) {
		this.firstName = firstName;
		this.lastName = secondName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.profession = profession;
		this.salary = salary;
		this.hobbies = hobbies;
		this.course = course;
	}

}
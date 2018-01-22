package demoApp.course;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Course")
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	protected  Course() {
		
	}
	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
}

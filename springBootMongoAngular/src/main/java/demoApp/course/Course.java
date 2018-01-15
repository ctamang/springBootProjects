package demoApp.course;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import demoApp.topic.Topic;

@Document(collection = "Course")
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	private Topic topic; 
	public Course() {
		
	}
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
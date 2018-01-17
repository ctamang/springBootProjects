package demoApp.course;


import org.springframework.data.annotation.Id;


import demoApp.topic.Topic;
import lombok.Data;

@Data
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
		this.setTopic(new Topic(topicId, "", ""));
	}
}

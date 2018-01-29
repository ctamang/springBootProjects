package demoApp.topic;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
}

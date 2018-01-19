package demoApp.Hobby;

import lombok.Data;

@Data
public class Hobby {
	
	private String name;

	public Hobby(String name) {
		this.name = name;
	}
}
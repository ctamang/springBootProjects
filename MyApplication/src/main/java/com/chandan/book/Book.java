package com.chandan.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {
  
	@Id
	@GeneratedValue
    private Long id;
    private String title;
    private String author;
    
    public Book() {
    	
    }

	public Book(Long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

    
}
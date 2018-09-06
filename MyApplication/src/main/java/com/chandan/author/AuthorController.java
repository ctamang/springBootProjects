package com.chandan.author;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

	
	@Autowired
	AuthorRepository authorRepository;
	
	@GetMapping("/authors")
	public List<Author> getAllAuthors(){
		return authorRepository.findAll();
	}
	
	@GetMapping("/authors/{id}")
	public Optional<Author> getAuthor(@PathVariable Long id){
		return authorRepository.findById(id);
	}
	
	@GetMapping("/authors/name/{firstName}")
	public Optional<List<Author>> getAuthor(@PathVariable String firstName){
		return authorRepository.findByFirstName(firstName);
	}
	
	@GetMapping("/authors/name/count/{fieldName}")
	public Long countByFirstName(@PathVariable String fieldName){
		return authorRepository.countByFirstName(fieldName);
	}
	
}

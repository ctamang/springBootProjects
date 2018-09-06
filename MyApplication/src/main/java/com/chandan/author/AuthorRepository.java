package com.chandan.author;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>  {

	public abstract Optional<List<Author>> findByFirstName(String firstName);
	
	public abstract Long countByFirstName(String firstName);
	
}

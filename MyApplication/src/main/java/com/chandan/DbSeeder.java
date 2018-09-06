package com.chandan;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.chandan.address.Address;
import com.chandan.address.AddressRepository;
import com.chandan.author.Author;
import com.chandan.author.AuthorRepository;
import com.chandan.book.Book;
import com.chandan.book.BookDataRestRepository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DbSeeder implements CommandLineRunner {

	@Autowired
	private BookDataRestRepository bookDataRestRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	
	public DbSeeder(BookDataRestRepository bookDataRestRepository) {
		this.bookDataRestRepository = bookDataRestRepository;
	}
	@Override
	public void run(String... arg0) throws Exception {
		
		this.bookDataRestRepository.deleteAll();
		log.info("inside" + DbSeeder.class + "uploading data to the db");
		final Address address1 = new Address("floyd drive", "kalalazmoo", "california", "USA");
		
		Book book1 = new Book("Kitty Kat", "Chandan Tamang");
		
		log.info("inside" + DbSeeder.class + "uploading data to the db");
		final Address address2 = new Address("gali no. 4", "tilak nagar", "new Delhi", "India");
		
		Author person2 = new Author("deepac", "bangarwa", "13-01-1991", "IT specialist", address1);
		
		Book book2 = new Book("Indian Zhones", "Chandan Tamang");
		
		Book book3 = new Book("Pre Order Pizza", "Chandan Tamang");
		
		log.info("adding data to the " + Author.class);
		List<Book> books = Arrays.asList(book1, book2, book3);
		
		final Address address3 = new Address("ambikapuram", "haldwani", "nainital", "India");
		
		Author person3 = new Author("chandan", "singh", "10-06-1991", "singer", address3);
		
		Author person1 = new Author("chandan", "tamang", "10-06-1991", "doctor", address2);
		List<Author> authors = Arrays.asList(person1, person2, person3);
		
		List<Address> address = Arrays.asList(address1, address2, address3);
		
		this.addressRepository.saveAll(address);
		
		this.bookDataRestRepository.saveAll(books);
		
		this.authorRepository.saveAll(authors);
	}
}

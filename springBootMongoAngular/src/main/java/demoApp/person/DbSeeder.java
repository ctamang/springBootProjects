package demoApp.person;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demoApp.Hobby.Hobby;
import demoApp.address.Address;
import demoApp.person.Person;
import demoApp.person.PersonRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DbSeeder implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;
	
	public DbSeeder(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	@Override
	public void run(String... arg0) throws Exception {
		
	
		log.info("inside" + DbSeeder.class + "uploading data to the db");
		final Address address = new Address("floyd drive", "kalalazmoo", "california", "USA");
		
		Hobby cricket = new Hobby("cricket");
		Hobby football = new Hobby("football");
		Hobby vollyBall = new Hobby("vollyBall");
		final List<Hobby> hobbies = Arrays.asList(cricket, football, vollyBall);
		
		Person person1 = new Person("chandan", "tamang", LocalDateTime.now(), address, "doctor", 10000000, hobbies);
		
		log.info("inside" + DbSeeder.class + "uploading data to the db");
		final Address address1 = new Address("gali no. 4", "tilak nagar", "new Delhi", "India");
		
		Hobby singing = new Hobby("singing");
		Hobby guitar = new Hobby("guitar");
		Hobby reading = new Hobby("reading");
		final List<Hobby> hobbies1 = Arrays.asList(singing, guitar, reading);
		
		Person person2 = new Person("deepac", "bangarwa", LocalDateTime.now(), address1, "IT specialist", 10000000, hobbies1);
		
		log.info("adding data to the " + Person.class);
		//this.personRepository.deleteAll();
		List<Person> persons = Arrays.asList(person1, person2);
		
		this.personRepository.save(persons);
	}
}

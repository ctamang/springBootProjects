package demoApp.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	public Person getPerson(String id) {
		return personRepository.findOne(id);
	}

	public void addPerson(Person person) {
		personRepository.save(person);
	}

	public void updatePerson(Person person) {
		personRepository.insert(person);
	}

	public void deletePerson(String id) {
		personRepository.delete(id);
	}

	public void findByName(String name) {
		personRepository.findByFirstName(name);
	}

}

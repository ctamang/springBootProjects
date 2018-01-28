package demoApp.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/persons")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/")
	public List<Person> getAllPersons(){
		log.info("inside method : personService.getAllPersons");
		return personService.getAllPersons();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Person getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updatePerson(@RequestBody Person person) {
		personService.updatePerson(person);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletePerson(@PathVariable String id) {
		personService.deletePerson(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/query/{name}")
	public List<Person> findByName(@PathVariable String name) {
		log.info("inside " + RequestMethod.GET + "parameters are : /api/persons/query/{name}");
		return personService.findByName(name);
	}
}

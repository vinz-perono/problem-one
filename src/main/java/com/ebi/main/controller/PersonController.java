package com.ebi.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebi.main.model.Person;
import com.ebi.main.service.PersonService;

@RestController
@RequestMapping( "/ebi" )
/**
 * Person controller class
 * @author vp
 */
public class PersonController {

	@Autowired  
	PersonService service;
	
	@GetMapping("/allperson")  
	private List<Person> retrieveAllPersons() {  
		return service.getPersons();
	}
	
	@GetMapping("/person/{id}")  
	private Person retrievePersonById(@PathVariable("id") int id) {  
		return service.getPersonById(id);
	}
	
	@PostMapping("/person")
	private int storePerson(@RequestBody Person person) {  
		service.addNewPerson(person);
		return person.getId();
	}
	
	@DeleteMapping("/allperson")  
	private void deleteAllPersons() {  
		service.deleteAllPersons();
	}
	
	@DeleteMapping("/person/{id}")  
	private void deletePersonById(@PathVariable("id") int id) {  
		service.deletePersonById(id);  
	}
	
	@PutMapping("/persons")  
	private Person updatePerson(@RequestBody Person person) {  
		service.updatePerson(person); 
		return person;  
	}
	
}

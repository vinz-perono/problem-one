package com.ebi.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebi.main.dao.PersonRepository;
import com.ebi.main.model.Person;

@Service
/**
 * Person service implementation
 * @author vp
 */
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonRepository dao;

	@Override
	public List<Person> getPersons() {
		List<Person> person = new ArrayList<Person>();  
		dao.findAll().forEach(person1 -> person.add(person1));  
		return person;
		//JpaRepo return dao.findAll();
	}

	@Override
	public Person getPersonById(int id) {
		return dao.findById(id).get();
		//JpaRepo Optional<Person> dao.findById(id).get();
	}

	@Override
	public Person addNewPerson(Person person) {
		return dao.save(person);
	}

	@Override
	public Person updatePerson(Person person) {
		return dao.save(person);
	}

	@Override
	public void deletePersonById(int id) {
		dao.deleteById(id);  
	}

	@Override
	public void deleteAllPersons() {
		dao.deleteAll();
	}

}

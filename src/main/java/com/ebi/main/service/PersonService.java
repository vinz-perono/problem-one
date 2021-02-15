package com.ebi.main.service;

import java.util.List;

import com.ebi.main.model.Person;

/**
 * Person service instance
 * @author vp
 */
public interface PersonService {
	
	public List<Person> getPersons();
	public Person getPersonById(int id);
	public Person addNewPerson(Person person);
	public Person updatePerson(Person person);
	public void deletePersonById(int id);
	public void deleteAllPersons();

}

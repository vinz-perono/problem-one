package com.ebi.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebi.main.model.Person;

@Repository
/**
 * Person dao repository
 * @author vp
 */
public interface PersonRepository extends CrudRepository<Person, Integer>{
}

package com.mst.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.mst.repository.bean.Person;

@Repository
public class PersonDao  {

	@Autowired
	private PersonRepository personRepository ;
	

	public Integer addPerson(Person person)
	{
		if( person.getAge()>= 0 && person.getAge() <= 120)
		{
			personRepository.save(person);
			return person.getAge();
		}
		return -999;
	}
	
	public Iterable<Person> getAll(){
		return personRepository.findAll();
	}
	
	public Person getById(long id){
		return personRepository.findById((int) id).get();
	}
	
	public Iterable<Person> getPersonBetweanAges(int from,int to){
		return personRepository.findPersonBetweenAge(from, to);
	}
	
	public Iterable<Person> getPersonOlderThan(int from){
		return personRepository.findPersonsByAgeGreaterThan(from);
	}
}

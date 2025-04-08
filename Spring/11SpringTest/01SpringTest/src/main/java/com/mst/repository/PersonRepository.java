package com.mst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mst.repository.bean.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	List<Person> findPersonsByAge(int age); 
	List<Person> findPersonsByName(String name);
	@Query("select per from Person per where per.age >= ?1 and per.age <= ?2")
	List<Person> findPersonBetweenAge(int from, int to);
	List<Person> findPersonsByAgeGreaterThan(int age);
	
}

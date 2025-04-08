package com.mst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.repository.PersonDao;
import com.mst.repository.bean.Person;

@Service
public class PersonStatistics {
	
	@Autowired
	private PersonDao dao;
	
	public double avgAge(){
		double result=0;
		int counter=0;
		for(Person p:dao.getAll()){
			counter++;
			result+=p.getAge();
		}
		if(counter==0)
			return 0;
		return result/counter;
	}
	
	public Person getById(Integer id){
		return dao.getById(id);
	}
}

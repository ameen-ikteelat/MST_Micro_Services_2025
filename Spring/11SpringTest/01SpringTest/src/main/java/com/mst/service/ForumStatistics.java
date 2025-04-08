package com.mst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.repository.FourmRepository;
import com.mst.repository.bean.Forum;
import com.mst.repository.bean.Person;
@Service
public class ForumStatistics {

	@Autowired
	private FourmRepository forumRepository;
	
	
	public double avgAge(){
		double result=0;
		int counter=0;
		for(Forum f:forumRepository.findAll()){
			for(Person p:f.getMembers()){
				counter++;
				result+=p.getAge();
			}
		}
		if(counter==0)
			return 0;
		return result/counter;
	}
	
	public double avgAge(long forumId){
		if(forumId<0)return -999;
		double result=0;
		int counter=0;
		for(Person p:forumRepository.findById((int) forumId).get().getMembers()){
			counter++;
			result+=p.getAge();
		}
		if(counter==0)
			return 0;
		return result/counter;
	}
}

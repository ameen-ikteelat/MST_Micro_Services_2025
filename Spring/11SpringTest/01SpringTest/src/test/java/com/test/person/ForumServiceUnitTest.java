package com.test.person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mst.Application;
import com.mst.repository.PersonDao;
import com.mst.repository.bean.Person;

@ContextConfiguration(classes =Application.class)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ForumServiceUnitTest {
	
	@Autowired
	private PersonDao personDao ;
	
	@Test
	public void testPersonAgeAvgByFourm()
	{
		Person person = new Person();
		person.setName("Alex");
		person.setGender("male");
		person.setAge(-10);
		
		assertEquals(-999, personDao.addPerson(person));
		
	}
}

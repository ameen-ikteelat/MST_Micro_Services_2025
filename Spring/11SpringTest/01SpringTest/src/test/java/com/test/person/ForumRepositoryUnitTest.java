package com.test.person;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mst.Application;
import com.mst.repository.PersonRepository;

@ContextConfiguration(classes =Application.class)
@DataJpaTest
public class ForumRepositoryUnitTest {
	@Autowired
	private PersonRepository repo;
	
	@Test
	public void testPersonAvgRange()
	{
		assertTrue(repo.findPersonBetweenAge(100, 0).size() == 0);
	}
}

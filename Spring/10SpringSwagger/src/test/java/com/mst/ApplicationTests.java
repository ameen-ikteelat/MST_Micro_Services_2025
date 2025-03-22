package com.mst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Test
	public void sumTest( int x , int y )
	{
		int actualValue =0;// sum(x,y); 
		int expectedValue=  x+y;
		
		assertEquals(expectedValue, actualValue);
	}
	
}

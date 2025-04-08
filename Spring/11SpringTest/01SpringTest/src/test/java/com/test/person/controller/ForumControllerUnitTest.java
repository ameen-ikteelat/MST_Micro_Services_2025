package com.test.person.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


@SpringBootTest(webEnvironment=WebEnvironment.MOCK )
@AutoConfigureMockMvc
public class ForumControllerUnitTest {
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testPersonAvgWSValue(){
		try {
			ResultActions ra=mvc.perform(get("/person/age/avg"));
			ra.andExpect(status().isOk()).andExpect(content().string("36.44444444444444")).andExpect(content().contentType(MediaType.ALL) );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test 
	public void testPersonAvgWSMatch() throws Exception
	{
		ResultActions ra = mvc.perform(get("/person/age/avg"));
		BaseMatcher<String> bm = new BaseMatcher<String>() {
			
			@Override
			public void describeTo(Description d) {
				d.appendText("Checking person avg age double value");
				
			}
			
			@Override
			public boolean matches(Object actual) {
				if(actual instanceof String){
					return Double.parseDouble((String)actual)>=0;
				}
				return false;
			}
		};
		ra.andExpect(status().isOk()).andExpect(content().string(bm));
	}
	
	
}

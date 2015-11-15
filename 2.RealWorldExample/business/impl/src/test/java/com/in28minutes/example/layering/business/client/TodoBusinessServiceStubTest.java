package com.in28minutes.example.layering.business.client;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.in28minutes.example.layering.business.api.client.TodoBusinessService;
import com.in28minutes.example.layering.model.api.client.Todo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/BusinessApplicationContext.xml" })
public class TodoBusinessServiceStubTest {

	@Autowired
	private TodoBusinessService todoBusinessService;

	@Test
	public void testClientProductSum() {
		List<Todo> todos = todoBusinessService
				.retrieveTodosForNextWeek("dummyUser");
		assertEquals(2, todos.size());
	}

}
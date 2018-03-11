package com.dmk.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testSetters() {
		Customer customer = new Customer();
		
		customer.setForename("Dave");
		assertEquals("Dave", customer.getForename());
	}
	
}

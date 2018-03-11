package com.dmk.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testSetters() {
		Customer customer = new Customer();
		
		customer.setForename("Dave");
		customer.setSurname("Kinmond");
		customer.setTitle("Mr");
		assertEquals("Dave", customer.getForename());
		assertEquals("Kinmond", customer.getSurname());
		assertEquals("Mr", customer.getTitle());
	}
	
}

package com.example.service;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.example.dao.ContactDao;

public class ContactServiceTest {
	
	@Test
	public void testGetNameById_1() {
		
		
		ContactDao daoproxy = EasyMock.createMock(ContactDao.class);
		EasyMock.expect(daoproxy.findNameById(101)).andReturn("Nishitha");
		EasyMock.expect(daoproxy.findNameById(102)).andReturn("Krishnagiri");
		EasyMock.replay(daoproxy);
		
		ContactServiceImpl service = new ContactServiceImpl();
		service.setContactdao(daoproxy);
		String name=service.getNameById(101);
		assertNotNull(name);
	}
}

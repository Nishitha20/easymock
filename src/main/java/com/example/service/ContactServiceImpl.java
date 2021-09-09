package com.example.service;

import com.example.dao.ContactDao;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao contactdao;
	
	
	
	public ContactDao getContactdao() {
		return contactdao;
	}



	public void setContactdao(ContactDao contactdao) {
		this.contactdao = contactdao;
	}



	@Override
	public String getNameById(Integer id) {
		String name= contactdao.findNameById(id);
		return name.toUpperCase();
	}

}

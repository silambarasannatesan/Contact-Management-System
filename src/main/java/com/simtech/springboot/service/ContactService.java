package com.simtech.springboot.service;

import java.util.List;

import com.simtech.springboot.model.Contact;

public interface ContactService {

	Contact findContactById(Long id);

	Contact findContactByName(String name);

	void saveContact(Contact Contact);

	void updateContact(Contact Contact);

	void deleteContactById(Long id);

	void deleteAllContacts();

	List<Contact> findAllContacts();

	boolean isContactExist(Contact contact);
}

package com.contact.directory.service;

import java.util.List;

public interface ContactDirectoryService {
 
	public List<String> getContacts();

	public String getContact(String contact);

	public boolean createContact(String contact);

	public boolean updateContact(String oldContact, String newContact);

	public boolean deleteContact(String contact);

}
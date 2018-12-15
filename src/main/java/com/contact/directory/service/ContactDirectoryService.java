package com.contact.directory.service;

import java.util.List;

import com.contact.directory.dto.ContactDTO;

public interface ContactDirectoryService {
 
	public List<ContactDTO> getContacts();

	public ContactDTO getContact(int contactID);

	public boolean createContact(ContactDTO contact);

	public boolean updateContact(ContactDTO newContactDTO);

	public boolean deleteContact(int contactID);

}
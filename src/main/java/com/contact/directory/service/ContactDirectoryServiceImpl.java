package com.contact.directory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.directory.dto.ContactDTO;

@Service
public class ContactDirectoryServiceImpl implements ContactDirectoryService {
 
	List<ContactDTO> contactList = new ArrayList<ContactDTO>();
	
	public List<ContactDTO> getContacts() {
		return contactList;
	}
	public ContactDTO getContact(int contactID) {
		
		for(ContactDTO contactDTO : contactList) {
			if (contactDTO.getId() == contactID) {
				return contactDTO ;
			}
		};
		return new ContactDTO();
	}
	public boolean createContact(ContactDTO contact) {
		contactList.add(contact);
		return true;
	}
	public boolean updateContact(ContactDTO newContactDTO) {
		
		for(ContactDTO contactDTO : contactList) {
			if (contactDTO.getId() == newContactDTO.getId()) {
				contactDTO = newContactDTO ;
				return true;
			}
		};
		return false;
	}
	public boolean deleteContact(int contactID) {
		
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getId() == contactID) {
				contactList.remove(i);
				return true;
			}
		}
		return false;
	}
 
}
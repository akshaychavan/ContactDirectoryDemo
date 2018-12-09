package com.contact.directory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ContactDirectoryServiceImpl implements ContactDirectoryService {
 
	List<String> contactList = new ArrayList<String>();
	
//	public void inIt() {
//		contactList.add("A");
//		contactList.add("b");
//		contactList.add("c");
//		contactList.add("d");
//		contactList.add("e");
//		contactList.add("f");
//		contactList.add("g");
//	}
	
	
	public List<String> getContacts() {
		return contactList;
	}
	public String getContact(String contact) {
		int getIndex = contactList.indexOf(contact);
		return getIndex > -1 ? contactList.get(getIndex) : "NO found "+contact;
	}
	public boolean createContact(String contact) {
		contactList.add(contact);
		return true;
	}
	public boolean updateContact(String oldContact, String newContact) {
		int insertIndex = contactList.indexOf(oldContact);
		contactList.remove(insertIndex);
		contactList.add(insertIndex, newContact);
		return true;
	}
	public boolean deleteContact(String contact) {
		int deleteIndex = contactList.indexOf(contact);
		contactList.remove(deleteIndex);
		return true;
	}
 
}
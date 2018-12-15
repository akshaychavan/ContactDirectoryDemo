package com.contact.directory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contact.directory.dto.ContactDTO;
import com.contact.directory.service.ContactDirectoryService;

@Controller
@RequestMapping(value = "/contact", method = RequestMethod.GET)
public class ContactDirectoryRestController {
	 
	@Autowired
	private ContactDirectoryService contactDirectoryService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<ContactDTO> getContacts() {
			return contactDirectoryService.getContacts();
		}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody ContactDTO getContact(@PathVariable("id") int contactID) {
			return contactDirectoryService.getContact(contactID);
		}
		
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody boolean createContact(@RequestBody ContactDTO contact) {
			return contactDirectoryService.createContact(contact);
		}
		
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody boolean updateContact(@RequestBody ContactDTO newContact) {
			return contactDirectoryService.updateContact(newContact);
		}
		
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteContact(@PathVariable("id") int contact) {
			return contactDirectoryService.deleteContact(contact);
		}
	 
}